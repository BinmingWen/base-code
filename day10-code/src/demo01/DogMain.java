package demo01;

/*

 */
public class DogMain {
    public static void main(String[] args) {
        DogGroen dogGroen = new DogGroen();
        dogGroen.eat();
        dogGroen.sleep();

        System.out.println("=============");
        DogErHa dogErHa = new DogErHa();
        dogErHa.eat();
        dogErHa.sleep();

    }
}
