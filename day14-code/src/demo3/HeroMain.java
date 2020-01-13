package demo3;

public class HeroMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("李白");
        hero.setAge(36);
        Weapon weapon = new Weapon("青莲之剑");
        hero.setWeapon(weapon);
        hero.attack();
    }
}
