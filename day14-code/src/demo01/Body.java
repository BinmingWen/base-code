package demo01;

public class Body {
    private String name;

    public class Heart{

        //内部类的方法
        public void beat() {
            System.out.println("心脏跳动BMG");
            System.out.println("名字："+name);
        }
    }
    public void methodBody() {
        System.out.println("外部类的方法");
        new Heart().beat();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Body(String name) {
        this.name = name;
    }

    public Body() {
    }
}
