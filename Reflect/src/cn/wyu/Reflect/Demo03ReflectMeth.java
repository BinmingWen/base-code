package cn.wyu.Reflect;

import cn.wyu.Domain.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo03ReflectMeth {
    public static void main(String[] args) throws Exception, IllegalAccessException {
        Class personClass = Person.class;
        Method eat_Method = personClass.getMethod("eat");
        Person p = new Person();
        eat_Method.invoke(p);
        System.out.println(p);
    }
}
