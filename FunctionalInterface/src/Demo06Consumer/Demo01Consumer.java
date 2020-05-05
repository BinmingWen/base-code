package Demo06Consumer;

import java.util.function.Consumer;

public class Demo01Consumer {
    public static void method(String name, Consumer<String> consumer) {
        consumer.accept(name);
    }

    public static void main(String[] args) {
        method("马化腾",(String s)->{
            String reName = new StringBuffer(s).reverse().toString();
            System.out.println(reName);
        });
    }
}
