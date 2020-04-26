package Demo07OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02OutputStreamWrite {
    public static void main(String[] args) throws IOException {
        File f = new File("FileAndRecursion\\b.txt");
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(49);
        fos.write(48);
        fos.write(48);
        byte[] bytes = {65, 66, 67, 68};
        //fos.write(bytes);
        fos.write(bytes, 0, 2);
        byte[] bs = "你好".getBytes();
        fos.write(bs);  //656789012345567
        fos.close();
    }
}
