package Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileTest {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("F:\\intellij idea\\base-code\\BaseClass\\src\\Scanner\\ScannerFileTest.java"));
        System.out.println("ScannerFileTest.java文件内容如下");
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
