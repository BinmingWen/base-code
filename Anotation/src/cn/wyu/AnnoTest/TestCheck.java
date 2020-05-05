package cn.wyu.AnnoTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCheck {
    public static void main(String[] args) {
        //1.创建Calculator类对象
        Calculator cal = new Calculator();
        //2.获取字节码文件对象
        Class<Calculator> cls = Calculator.class;
        //3.获取Calculator对象的所有方法
        Method[] methods = cls.getMethods();
        //4.异常次数
        int num = 0;
        //创建文件输出流
        BufferedWriter bw = null;
        try {
             bw = new BufferedWriter(new FileWriter("F:\\intellij idea\\base-code\\Anotation\\src\\cn\\wyu\\AnnoTest\\bug.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Method method : methods) {
            //5.检测包含注解的方法，并作相应处理。
            if(method.isAnnotationPresent(Check.class)){
                try {
                        method.invoke(cal);
                } catch (Exception e) {
                    //e.printStackTrace();
                    num++;     //记录异常
                    try {
                        bw.write(method.getName()+"方法出现异常");
                        bw.newLine();
                        bw.write("异常名称："+e.getCause().getClass().getSimpleName());
                        bw.newLine();
                        bw.write("异常原因："+e.getCause().getMessage());
                        bw.newLine();
                        bw.write("---------------- ");
                        bw.newLine();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        try {
            bw.write("本次测试一共出现了"+num+"次异常");
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
