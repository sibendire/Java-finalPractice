package inheritance;

public class Fish extends Animal {
    private int gills;
    private int eye;
    private int fins;

    public Fish(String name,  int weight, int size, int gills, int eye, int fins) {
        super(name, 1, 1, weight, size);
        this.gills = gills;
        this.eye = eye;
        this.fins = fins;
    }
    private void rest(){

    }
    public void swim(int speed){
    moveMuscles();
    moveBackFins();
    super.move(2);
    }
    private void moveMuscles(){

    }
    private void moveBackFins(){

    }
}
