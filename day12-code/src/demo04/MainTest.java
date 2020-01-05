package demo04;

public class MainTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        USB usb = new Mouse();
        computer.powerOn();
        computer.userDevice(new KeyBoard());
        computer.close();
    }
}
