package inheritance;

public class Dog extends Animal {
    private int legs;
    private int tails;
    private int nose;
    private int feet;

    public Dog(String name, int weight, int size, int legs, int tails, int nose, int feet) {
        super(name, 1, 1, weight, size);
        this.legs = legs;
        this.tails = tails;
        this.nose = nose;
        this.feet = feet;
    }

    private void chew() {
        System.out.println("Dog.chew method called");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat() called");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("dog.walk() called");
        move(5);
    }
    public void run(){
        System.out.println("dog.run() called");
        move(10);
    }
}