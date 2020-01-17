package CazyTest;

public class AnonymousInner {
    public void test(Device device) {
        System.out.println("购买了一个："+device.getName()+",花费掉了"+device.getPrice());
    }
    public static void main(String[] args) {
        AnonymousInner ai = new AnonymousInner();
        ai.test(new Device("雷神托盘") {
            @Override
            public double getPrice() {
                return 77.9;
            }
        });
        //
        Device d = new Device() {
            {
                System.out.println("匿名内部类初始化代码块");
            }
            @Override
            public double getPrice() {
                return 22.3;
            }

            @Override
            public String getName() {
                return "键盘";
            }
        };
        ai.test(d);
    }
}
