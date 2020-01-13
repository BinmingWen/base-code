package Demo06;

public abstract class Shape {
    {
        System.out.println("执行Shape的初始化块");
    }
    //颜色
    private String color;
    //计算周长
    public abstract double calPerimeter();
    //返回形状
    public abstract String getType();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }
}
