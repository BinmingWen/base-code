package cn.wyu.upperBound;

import java.util.List;

public class Canvas {
    public void drawAll(List<? extends Shape> shapes) {
        //shapes.add(new Circle());
        for (Shape s : shapes) {
            s.draw(this);
        }
    }
}
