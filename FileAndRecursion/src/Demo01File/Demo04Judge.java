package Demo01File;

import java.io.File;

public class Demo04Judge {
    public static void main(String[] args) {
        File f1 = new File("F:\\intellij idea\\base-code\\FileAndRecursion\\FileAndRecursion.iml");
        System.out.println(f1.exists());
        File f2 = new File("F:\\intellij idea\\base-cod\\FileAndRecursion");
        if (f2.exists()) {
            System.out.println(f2.isDirectory());
            System.out.println(f2.isFile());
        }
    }
}
