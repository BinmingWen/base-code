package cn.wyu.Test;

import cn.wyu.Junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.DynamicTest;
import org.junit.Test;

public class CalculatorTest {
    @Before
    public void init(){
        System.out.println("Init......");
    }
    @After
    public void close(){
        System.out.println("Close.....");
    }
    @Test
    public void addTest(){
        Calculator cal = new Calculator();
        int result = cal.add(1, 2);
        Assert.assertEquals(3,result);
    }
    @Test
    public void subTest(){
        Calculator cal = new Calculator();
        int result = cal.sub(1, 2);
        System.out.println(result);
        Assert.assertEquals(result,1);
    }

}
