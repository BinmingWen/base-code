package Demo10Buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo05BufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\intellij idea\\base-code\\FileAndRecursion\\f.txt"));
        bw.write("你好啊");
        bw.newLine();
        bw.write("你好啊");
        bw.flush();
        bw.close();
    }
}
