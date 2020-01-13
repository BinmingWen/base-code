package demo04;

public class HeroMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("鲁班七号");
        /*//通过实现类来实现的
        Skill skill = new SillImple();
        hero.setSkill(skill);
        hero.attack();*/
        //匿名内部类
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("peng~peng~peng");
            }
        };
        hero.setSkill(skill);
        hero.attack();

        //匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("Ju~ju~ju");
            }
        });
        hero.attack();
    }
}
