package CazyTest03;

public class Cow {
    private double weight;
    public Cow(){}

    public Cow(double weight) {
        this.weight = weight;
    }
    private class CowLeg{
        private double length;
        private String color;
        public CowLeg(){}

        public CowLeg(double length, String color) {
            this.length = length;
            this.color = color;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        //内部类的实例方法
        public void info() {
            System.out.println("当前牛腿的颜色：" + color + ",高：" + length);
            System.out.println("该牛的重量为: "+weight);
        }
    }
    public void test(){
        CowLeg cowLeg = new CowLeg(22.3, "黑色");
        //System.out.println(color);
        cowLeg.info();
    }
}
