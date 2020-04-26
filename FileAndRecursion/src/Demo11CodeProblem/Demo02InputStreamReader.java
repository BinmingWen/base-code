package Demo11CodeProblem;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo02InputStreamReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\intellij idea\\base-code\\FileAndRecursion\\src\\gbk.txt"), "gbk");
        int len;
        while ((len = isr.read()) != -1) {
            System.out.println((char)len);
        }
        isr.close();
    }
}
