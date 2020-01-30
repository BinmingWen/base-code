package cn.wyu.Enum.Demo02;

public enum Gender implements GenderDesc {
    MALE("男") {
        public void info(){
            System.out.println("这个枚举值代表男性");
        }
    },
    FEMALE("女"){
        public void info(){
            System.out.println("这个枚举值代表女性");
        }
    };
    private final String name;

    private Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    /*@Override
    public void info() {
        System.out.println("这个枚举值代表性别");
    }*/
}
