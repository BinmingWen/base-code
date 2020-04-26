package Demo01File;

import java.io.File;

public class Demo01FileStaticMethod {
    public static void main(String[] args) {
        /*
        static String pathSeparator 与系统相关的路径分隔符字符，为方便起见，表示为字符串。
        static char pathSeparatorChar 与系统相关的路径分隔符。
        static String separator 与系统相关的默认名称 - 分隔符字符，以方便的方式表示为字符串。
        static char separatorChar 与系统相关的默认名称分隔符
*/
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);
        System.out.println("======");
        String separator = File.separator;
        System.out.println(separator);
        System.out.println(File.pathSeparatorChar);
    }
}
