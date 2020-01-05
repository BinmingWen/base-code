package demo03;

public class AnimalMaintTest {
    public static void main(String[] args) {
        Animal animal = new Cat();
        //animal.eat();

        if(animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        getMeAnAnimal(animal);
     /*   //ClassCastException转换异常
        Dog dog = (Dog) animal;
        dog.eat();*/
    }

    public static void getMeAnAnimal(Animal animal) {
        if(animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
    }
}
