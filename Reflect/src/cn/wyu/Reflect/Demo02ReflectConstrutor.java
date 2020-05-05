package cn.wyu.Reflect;

import cn.wyu.Domain.Person;
import cn.wyu.Domain.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo02ReflectConstrutor {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class personClass = Person.class;
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        Object obj = constructor.newInstance("李四", 22);
        System.out.println(obj);
        System.out.println("=====");
        Constructor constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        Object o = constructor1.newInstance();
        System.out.println(o);
        System.out.println("---------");
        /*Class<Student> studentClass = Student.class;
        Constructor<Student> constructor2 = studentClass.getConstructor();
        System.out.println(constructor2);*/
    }
}
