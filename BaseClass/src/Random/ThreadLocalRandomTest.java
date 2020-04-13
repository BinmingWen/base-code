package Random;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomTest {
    public static void main(String[] args) {
        ThreadLocalRandom rand = ThreadLocalRandom.current();
        int vall = rand.nextInt(4, 20);
        System.out.println(vall);
        //生成浮点型

        double vall2 = rand.nextDouble(2.0, 10.2);


        System.out.println(vall2);



    }
}
