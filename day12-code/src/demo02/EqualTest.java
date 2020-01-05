package demo02;

public class EqualTest {
    public static void main(String[] args) {
        int it = 65;
        float f = 65.0f;
        System.out.println(it == f);
        System.out.println("=======");
        char ch ='A';
        System.out.println(ch == it);
        System.out.println("=======");
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
    }
}
