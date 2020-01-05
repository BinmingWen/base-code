package demo04;

public class Computer {
    public void powerOn(){
        System.out.println("开机");
    }

    public void userDevice(USB usb){

        usb.open();
        if (usb instanceof Mouse) {
            ((Mouse) usb).click();
        }
        if (usb instanceof KeyBoard) {
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.type();
        }
        usb.close();
    }
    public void close() {
        System.out.println("关机");
    }
}
