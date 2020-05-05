package cn.wyu.Reflect;

import cn.wyu.Domain.Person;

import java.lang.reflect.Field;

public class Demo02ReflectMethod {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        /**
         * 获取成员变量
         *
         */
        Class personClass = Person.class;
        /**
         * 方法：
         * Field getField(String name)返回一个 Field对象，它反映此表示的类或接口的指定公共成员字段 类对象。  
         * Field[] getFields()返回包含一个数组 Field对象反射由此表示的类或接口的所有可访问的公共字段 类对象。  
         */
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("--------");
        Field a = personClass.getField("a");
        Person p = new Person();
        Object obj = a.get(p);
        System.out.println(obj);
        System.out.println("=========");
        a.set(p, "张三");
        System.out.println(p);
        System.out.println("-----------");
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredFied : declaredFields) {
            System.out.println(declaredFied);
        }
        Field name = personClass.getDeclaredField("name");
        name.setAccessible(true);  //暴力反射机制。
        name.set(p,"java");
        Object o = name.get(p);
        System.out.println(o);
    }
}
