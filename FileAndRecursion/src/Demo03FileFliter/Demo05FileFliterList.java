package Demo03FileFliter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

public class Demo05FileFliterList {
    public static void main(String[] args) throws IOException {
        File file = new File("F:\\wenjian");
        getFile(file);
    }

    private static void getFile(File file) {
       /* //使用FileFilter实现类
        File[] f = file.listFiles(new FileFilterImple());*/
       //使用匿名内部类
        /*File[] f = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
               *//* //只遍历.txt后缀名的文件
                String path = pathname.getName();
                String str = path.toLowerCase();
                boolean b = str.endsWith(".txt");
                //判断是否为文件夹
                if (pathname.isDirectory()) {
                    return true;
                }
                //判断后缀名是否为.txt;
                return b;*//*
                //链式编程
                return pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".txt");
            }
        });*/
       /* //使用lambda表达时
        File[] f = file.listFiles(pathname->
            pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".txt")
        );*/
       //使用重载方法FilenameFilter
       /* File[] f = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".txt");
            }
        });*/
        //使用重载方法FilenameFilter,并使用lambda表达时
        File[] f = file.listFiles((dir,name)->
            new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".txt"));

        for (File ff : f) {
            if (ff.isDirectory()) {
                getFile(ff);
            } else {
                System.out.println(ff.getName());

            }
        }
    }
}
