package Demo07OutputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo07ChineseException {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\intellij idea\\base-code\\FileAndRecursion\\a.txt");
        int len;
        while ((len = fis.read()) != -1) {
            System.out.println(len);
        }
        fis.close();
    }
}
