package demo01;

public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        Integer a = 6;
        Object obj = true;
        if(obj instanceof Boolean) {
            boolean b = (Boolean)obj;
            int c = a;
            System.out.println(c);
            System.out.println(b);
        }
    }
}
