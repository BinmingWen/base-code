package Random;

import java.util.Arrays;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println(rand.nextBoolean());
        byte[] buffer = new byte[16];
        rand.nextBytes(buffer);
        System.out.println(Arrays.toString(buffer));
    }
}
