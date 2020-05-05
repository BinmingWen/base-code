package cn.wyu.Reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Properties pro = new Properties();
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("pro.properties");
        pro.load(resourceAsStream);

        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        Class cls = Class.forName(className);
        Method method = cls.getMethod(methodName);
        Constructor constructor = cls.getConstructor();
        Object o = constructor.newInstance();
        System.out.println(o);
        method.invoke(o);
    }
}
