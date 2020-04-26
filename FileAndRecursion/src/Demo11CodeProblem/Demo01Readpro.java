package Demo11CodeProblem;

import java.io.FileReader;
import java.io.IOException;

public class Demo01Readpro {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("F:\\intellij idea\\base-code\\FileAndRecursion\\src\\gbk.txt");
        int len =0;
        while ((len = fr.read()) != -1) {
            System.out.println((char)len);
        }
        fr.close();
    }
}
