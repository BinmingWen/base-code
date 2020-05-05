package Demo03ObjectStaticRef;

public class Demo01StaticRef {
    public static int calAbs(int a,Caculable cal) {
        return cal.caculAbs(a);
    }
    public static void main(String[] args) {
        int i = calAbs(-10,(a -> {
            return Math.abs(a);
        }));
        System.out.println(i);
        int j = calAbs(10, Math::abs);
        System.out.println(j);
    }
}
