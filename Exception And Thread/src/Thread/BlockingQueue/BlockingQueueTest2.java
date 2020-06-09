package Thread.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest2 {
    public static void main(String[] args) {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        new Producer(bq).start();
        new Producer(bq).start();
        new Producer(bq).start();

        new Consumer(bq).start();
    }
}
