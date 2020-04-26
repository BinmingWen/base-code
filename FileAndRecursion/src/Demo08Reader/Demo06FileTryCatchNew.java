package Demo08Reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo06FileTryCatchNew {
    public static void main(String[] args) throws FileNotFoundException {
        //使用新的tryCatch
        FileInputStream fis = new FileInputStream("C:\\Users\\wenmingbin\\Pictures\\Camera Roll\\women.jpg");
        FileOutputStream fos = new FileOutputStream("E:\\picture\\we.jpg");
        try(fis;fos){
            int len = 0;
            byte[] bytes = new byte[1024];
            while((len =fis.read(bytes))!=-1)
            {
                fos.write(bytes, 0, len);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
