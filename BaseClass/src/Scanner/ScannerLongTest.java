package Scanner;

import java.util.Scanner;

public class ScannerLongTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sc.useDelimiter("\n");
        while (sc.hasNextLong()) {
            System.out.println("输入的内容是："+sc.nextLong());
        }

    }
}
