package Demo13PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("print.txt"));
        ps.write(97);
        ps.println(3);
        ps.println('A');
        ps.println(0.9);
        ps.println("Helloworld");
        ps.println('a');
        ps.println(9.8);
        ps.close();
    }
}
