package Demo01File;

import java.io.File;

public class Demo03GetMethod {
    public static void main(String[] args) {
        File f1 = new File("F:\\wenjian");
        System.out.println(f1.getAbsoluteFile());
        System.out.println(f1.getName());
        System.out.println(f1.toString());
        System.out.println(f1.getPath());

        System.out.println("==========");
        File f2 = new File("C:\\Users\\wenmingbin\\Pictures\\Camera Roll");
        System.out.println(f2.length());
        //System.out.println("C:\\Users\\wenmingbin\\Pictures\\Camera Roll");
    }
}
