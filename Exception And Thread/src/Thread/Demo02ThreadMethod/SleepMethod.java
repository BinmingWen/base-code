package Thread.Demo02ThreadMethod;

public class SleepMethod {
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
