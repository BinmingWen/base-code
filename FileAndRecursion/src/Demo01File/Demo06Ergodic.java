package Demo01File;

import java.io.File;

public class Demo06Ergodic {
    public static void main(String[] args) {
        File f = new File("F:\\intellij idea\\base-code\\FileAndRecursion");
        String[] list = f.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------");
        File[] files = f.listFiles();
        for (File fs : files) {
            System.out.println(fs);
        }
    }
}
