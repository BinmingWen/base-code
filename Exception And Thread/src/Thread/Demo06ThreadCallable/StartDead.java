package Thread.Demo06ThreadCallable;

public class StartDead extends Thread{
    private int i;

    @Override
    public void run() {
        for (; i < 2; i++) {
            System.out.println(getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        StartDead st = new StartDead();
        st.start();
        System.out.println(st.isAlive());
        st.start();
        System.out.println(st.isAlive());
        /*for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                st.start();
                System.out.println(st.isAlive());
            }
            if (i > 20 && !st.isAlive()) {
                st.start();
            }
        }*/
    }
}
