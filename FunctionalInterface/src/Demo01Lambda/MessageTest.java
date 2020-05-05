package Demo01Lambda;

public class MessageTest {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Java";
        showLog(2, ()->{
            return s1+s2+s3;
        });
    }

    public static void showLog(int i, MessageBuilder messageBuilder) {
        if (i == 1) {

            System.out.println( messageBuilder.method());
        }
    }
}
