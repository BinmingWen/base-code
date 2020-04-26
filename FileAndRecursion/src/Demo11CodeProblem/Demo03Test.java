package Demo11CodeProblem;

import java.io.*;

/*
  把一个gbk文件转化为utf-8文件
 */
public class Demo03Test {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\intellij idea\\base-code\\FileAndRecursion\\src\\gbk.txt"), "gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("F:\\intellij idea\\base-code\\FileAndRecursion\\src\\utf.txt"), "utf-8");
        int len = 0;
        while ((len = isr.read()) != -1) {
            osw.write(len);
        }
        osw.close();
        isr.close();
    }
}
