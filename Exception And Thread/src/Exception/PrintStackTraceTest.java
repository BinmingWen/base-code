package Exception;

public class PrintStackTraceTest {
    public static void main(String[] args) {
        firstMethod();
    }

    private static void firstMethod() {
        secondMethod();
    }

    private static void secondMethod() {
        thirdMethod();
    }

    private static void thirdMethod() {
        throw new SelfException("自定义异常信息");
    }
}
