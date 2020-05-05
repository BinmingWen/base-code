package Demo05Supplier;

import java.util.function.Supplier;

public class Demo01SupplierTest {
    public static String getName(Supplier<String> supplier) {
        return supplier.get();
    }

    public static void main(String[] args) {
        System.out.println(getName(()->{
            return "胡歌";
        }));
    }
}
