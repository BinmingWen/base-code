package Demo03FileFliter;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImple implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        //只遍历.txt后缀名的文件
        String path = pathname.getName();
        String str = path.toLowerCase();
        boolean b = str.endsWith(".txt");
        //判断是否为文件夹
        if (pathname.isDirectory()) {
            return true;
        }
        //判断后缀名是否为.txt;
        return b;
    }
}
