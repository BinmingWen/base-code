package Demo11CodeProblem;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo01OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("F:\\intellij idea\\base-code\\FileAndRecursion\\src\\gbk.txt"),"GBK");
        osw.write("你好");
        osw.flush();
        osw.close();
    }
}
