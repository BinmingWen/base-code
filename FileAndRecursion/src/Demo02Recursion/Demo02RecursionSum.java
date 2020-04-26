package Demo02Recursion;

public class Demo02RecursionSum {
    public static void main(String[] args) {
        int sum = sum(6);
        System.out.println(sum);
    }

    /*
        计算1-n之间的总和
     */
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}


