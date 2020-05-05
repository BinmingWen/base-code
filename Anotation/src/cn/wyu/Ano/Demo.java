package cn.wyu.Ano;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

@Pro(className = "cn.wyu.Ano.Test",methodName = "show")
public class Demo {
    public static void main(String[] args) throws Exception {
        //解析注解
        //获取该类的字节码文件对象
        Class<Demo> demoClass = Demo.class;
        //获取上边的注解对象
        Pro pro = demoClass.getAnnotation(Pro.class);
        /*
        public class ProImple implements Pro{
            public String className(){
                return "cn.wyu.Ano.Test";
            }
            public String method(){
                return "show";
            }
        }
         */
        String s = pro.className();
        System.out.println(s);
        String s1 = pro.methodName();
        System.out.println(s1);

        Class cls = Class.forName(s);
        Constructor constructor = cls.getConstructor();
        Object o = constructor.newInstance();
        Method method = cls.getMethod(s1);
        method.invoke(o);

    }
}
