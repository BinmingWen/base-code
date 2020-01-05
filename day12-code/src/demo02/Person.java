package demo02;

public class Person {
    private String name;
    private String idStr;

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
