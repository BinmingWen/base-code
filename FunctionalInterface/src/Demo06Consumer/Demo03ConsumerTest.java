package Demo06Consumer;

import java.util.function.Consumer;

public class Demo03ConsumerTest {
    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        for (String name : arr) {
            con1.andThen(con2).accept(name);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"马化腾,46","马云,56","刘强东,62"};
        printInfo(arr,(String name)->{
            String s = name.split(",")[0];
            System.out.print("姓名："+s);
        },(String name)->{
            String s = name.split(",")[1];
            System.out.println(" 性别："+s);
        });
    }
}
