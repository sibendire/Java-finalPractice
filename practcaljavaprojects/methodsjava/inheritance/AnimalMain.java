package inheritance;

public class AnimalMain {
    public static void main(String[] args) {

        Animal animal = new Animal("jax", 1, 2, 1, 3);

        Dog dog = new Dog("john", 3, 4, 1, 1, 4, 1);
        dog.eat();
        dog.walk();
        Fish fish = new Fish("Tilapia",12,1,3,4,2);
        fish.eat();
        fish.move(200);
        fish.swim(123);

    }
}
