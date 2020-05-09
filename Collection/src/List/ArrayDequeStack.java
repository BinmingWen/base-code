package List;

import java.util.ArrayDeque;

public class ArrayDequeStack {
    public static void main(String[] args) {
        //把ArrayDeque当做栈来使用
        ArrayDeque stack = new ArrayDeque();
        stack.push("李白");
        stack.push("赵云");
        stack.push("马超");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
