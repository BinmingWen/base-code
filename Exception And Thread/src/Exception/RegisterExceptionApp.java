package Exception;

import java.util.Scanner;

/*要求：
    模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户已经被注册了。

 */
public class RegisterExceptionApp {
    static String[] username = {"张三", "李四", "王五"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的名字: ");
        String s = sc.next();
        checkUsername(s);
    }

    private static void checkUsername(String s) {
        for (String str : username) {
            if (str.equals(s)) {
                    throw new RegisterException("亲，该用户已经被注册了");
            }
        }
        System.out.println("恭喜你，注册成功");
    }

}
