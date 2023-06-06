import java.util.Locale;

public class ObjectsCar {
    private int car;
    private String wheel;
    private String colour;
    private double door;

    public void setCar(int car){
        int validCarNumber = car;
        if (validCarNumber >=4) {
            this.car = car;
        }else {
            this.car = -1;
        }
    }

    public int getCar() {
        return this.car;
    }
    public void setWheel(String wheel){
        this.wheel = wheel;
    }

    public String getWheel() {
        return this. wheel;
    }
    public void setColour(String colour){
        String validColour = colour.toLowerCase();
        if (validColour.equals("yellow") || validColour.equals("green")) {
            this.colour = colour;
        }else {
            this.colour = "unknown";
        }
    }
    public String getColour(){
        return this.colour;
    }
    public void setDoor(double door){
        this.door =door;
    }
}
