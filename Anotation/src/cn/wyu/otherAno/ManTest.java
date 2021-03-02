package cn.wyu.otherAno;

import java.lang.annotation.Annotation;

public class ManTest {
    public static void main(String[] args) {
        Annotation[] annotations = Man.class.getAnnotations();
        System.out.println(annotations.length);
        Persons p = (Persons) annotations[0];
        for (Person person : p.value()) {
            System.out.println(person.value());
            //System.out.println(person.name);
        }
    }
}
