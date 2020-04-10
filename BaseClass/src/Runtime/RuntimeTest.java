package Runtime;

import java.io.IOException;

public class RuntimeTest {
    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime();
        System.out.println("处理器的数量"+rt.availableProcessors());
        System.out.println("空闲内存：" + rt.freeMemory());
        System.out.println("总内存：" + rt.totalMemory());
        System.out.println("可用最大内存："+rt.maxMemory());
        rt.exec("notepad.exe");
    }
}
