package Demo01File;

import java.io.File;

public class Demo02FilePath {
    public static void main(String[] args) {
        //绝对路径
        //相对目录
        //File构造方法
        File f1 = new File("F:\\wen\\a.txt");
        System.out.println(f1);
        System.out.println("--------");
        File f2 = new File("c:\\", "a.txt");
        System.out.println(f2);
        File f3 = new File(f2, "a.txt");
        System.out.println(f3);
    }
}
