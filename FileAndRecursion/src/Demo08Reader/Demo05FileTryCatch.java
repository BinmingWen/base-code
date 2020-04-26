package Demo08Reader;

import java.io.FileWriter;
import java.io.IOException;

public class Demo05FileTryCatch {
    public static void main(String[] args) {
        FileWriter fw=null;
        try {
            fw = new FileWriter("FileAndRecursion\\f.txt", true);
            for (int i = 0; i < 10; i++) {
                fw.write("嘉怡" + i + "\r\n");
            }
            fw.flush();
        } catch (IOException e) {
            System.out.println(e);
        }finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
