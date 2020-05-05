package cn.wyu.Reflect;

import cn.wyu.Domain.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
   获取反射的三种方式，
   1.Class.forName
   2.类名.class
   3.对象.getClass
 */
public class Demo01Reflect {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        //1.通过内存获取
        Class cl = Class.forName("cn.wyu.Domain.Person");
        ///Person person =  cl;
        //person.eat();
        Method eat = cl.getMethod("eat");
        Object invoke = eat.invoke(new Person());
        System.out.println(invoke);
        System.out.println(cl);
        System.out.println("--------");
        //2.通过类名获取
        Class cl2 = Person.class;
        Field a = cl2.getField("a");
        System.out.println(a);
        a.set(p,"我");
        Object o = a.get(p);
        System.out.println("o= "+ o);
        System.out.println(p);
        System.out.println(cl2);
        //System.out.println(p == cl2);
        System.out.println("--------");
        //2.通过类对象来获取

        Class cl3 = p.getClass();
        System.out.println(cl3);
        Field name = cl3.getField("name");
        name.set(p,"温明彬");
        Object o1 = name.get(p);
        System.out.println(01);
        System.out.println(cl == cl2);
        System.out.println(cl2==cl3);

    }
}
