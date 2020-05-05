package Demo06Consumer;

import java.util.function.Consumer;

public class Demo02ConsumerAndThen {
    public static void method(String name, Consumer<String> con1, Consumer<String> con2) {
        //con1.accept(name);
        //con2.accept(name);
        con1.andThen(con2).accept(name);
    }

    public static void main(String[] args) {
        method("Hello",(String name)->{
            System.out.println(name.toUpperCase());
        },(String name)->{
            System.out.println(name.toLowerCase());
        });
    }
}
