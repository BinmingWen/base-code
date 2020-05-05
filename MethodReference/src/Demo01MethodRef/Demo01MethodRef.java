package Demo01MethodRef;

public class Demo01MethodRef {
    public static void main(String[] args) {
        print((s)->{
            System.out.println(s);
        });
        print(System.out::println);

    }

    public static void print(Printable<String> printable) {
        printable.print("Helloworld");
    }
}
