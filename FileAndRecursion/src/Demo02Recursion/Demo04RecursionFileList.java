package Demo02Recursion;

import java.io.File;
import java.io.IOException;

public class Demo04RecursionFileList {
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
                System.out.println(ff.getName());
            }
        }
    }
}
