package Demo02Recursion;

import java.io.File;
import java.io.IOException;

public class Demo05RecursionFileList {
    public static void main(String[] args) throws IOException {
        File file = new File("F:\\wenjian");
        getFile(file);
    }

    private static void getFile(File file) {
        File[] f = file.listFiles();
        for (File ff : f) {
            if (ff.isDirectory()) {
                getFile(ff);
            } else {
                //只遍历.txt后缀名的文件
                String path = ff.getName();
                System.out.println(path);
                boolean b = path.endsWith(".txt");
                if (b) {
                    System.out.println(ff.getName());
                }
            }
        }
    }
}
