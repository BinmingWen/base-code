package demo04;

import java.util.ArrayList;
/*
int---Integer
char--Character
float-Float
double-Double
byte-Byte
boolean-Boolean
long-Long
short-short
自动类型：基本类型->包装类型
自动拆箱：包装类型->基本类型
 */
public class demo04ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        System.out.println(list);
    }
}
