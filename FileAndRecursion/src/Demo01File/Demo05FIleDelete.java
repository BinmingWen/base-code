package Demo01File;

import java.io.File;
import java.io.IOException;
/*
   createNewFile
   mkdir
   mkdirs
   delete
 */
public class Demo05FIleDelete {
    public static void main(String[] args) {
        File f1 = new File("F:\\intellij idea\\base-code\\FileAndRecursion\\src\\1.txt");
        try {
            System.out.println( f1.createNewFile());;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("-----");
        File f2 = new File("FileAndRecursion\\src\\2.txt");
        try {
            System.out.println( f2.createNewFile());;
        } catch (IOException e) {
            e.printStackTrace();
        }
        File f3  = new File("F:\\intellij idea\\base-code\\FileAndRecursion\\abcd\\1");
        //System.out.println(f3.mkdir());
        //System.out.println(f3.mkdirs());
        System.out.println(f3.delete());
    }
}
