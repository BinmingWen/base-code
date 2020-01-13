package demo02;

import java.util.Objects;

public class Person {
    private String name;
    private String idStr;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(idStr, person.idStr);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public Person() {
    }

    public Person(String name, String idStr) {
        this.name = name;
        this.idStr = idStr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

//重写Object的equals方法

    /*@Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if (obj != null && obj instanceof Person) {
            Person p = (Person) obj;
            if(p.getIdStr().equals(p.getIdStr())){
                return true;
            }
        }
        return false;

    }*/
}
