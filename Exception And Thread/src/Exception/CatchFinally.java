package Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchFinally {
    public static void main(String[] args) {
        try {
            readFile("c:\\a.tx");
        } catch (IOException e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            //无论是否产生异常，都会执行finally代码块
            System.out.println("资源释放");
        }
        System.out.println("后续代码");

    }

    private static void readFile(String s) throws IOException {
        if (!s.endsWith("txt")) {
            throw new IOException("后缀名不是txt文件");
        }
    }
}
