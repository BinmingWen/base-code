package Demo13PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Demo01SystemPrint {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("print.txt"));
        System.setOut(ps);
        System.out.println("你好啊，我是温明彬");
        ps.close();
    }
}
