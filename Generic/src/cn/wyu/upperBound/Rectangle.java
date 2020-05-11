package cn.wyu.upperBound;

import java.awt.*;

public class Rectangle extends Shape {

    @Override
    public void draw(Canvas c) {
        System.out.println("把一个矩形画在画布"+c+"上");
    }
}
