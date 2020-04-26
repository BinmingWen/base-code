package Demo10Buffered;

import java.io.*;

public class Demo04BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new FileReader("F:\\intellij idea\\base-code\\FileAndRecursion\\f.txt"));
        int len = 0;
        char[] bytes = new char[1024];
        /*while ((len = bis.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
        }*/
       /* System.out.println(bis.readLine());
        System.out.println(bis.readLine());
        System.out.println(bis.readLine());*/
       String str = null;
        while ((str = bis.readLine()) != null) {
            System.out.println(str);
        }
        bis.close();
    }
}
