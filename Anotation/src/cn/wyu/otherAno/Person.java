package cn.wyu.otherAno;

import java.lang.annotation.Repeatable;

@Repeatable(value = Persons.class)
public @interface Person {
    String value() default "";
}
