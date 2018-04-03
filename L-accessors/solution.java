1.

public class Animal {

    String name = "Frog";
    int numberOfLegs = 4;
    String sound = "Ribbit!";
    String color = "Green";
    boolean isPreditor = false;
    
    Animal(String newColor) {
        color = newColor;
    }

    public Animal(String name, int numberOfLegs, String sound, String color, boolean isPreditor) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.sound = sound;
        this.color = color;
        this.isPreditor = isPreditor;
    }

    public void makeNoise() {
        System.out.println(sound);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPreditor() {
        return isPreditor;
    }

    public void setPreditor(boolean preditor) {
        isPreditor = preditor;
    }
}

2.
public class Main {
    public static void main(String[] args) {
        Animal frog = new Animal("Red");

        frog.setPreditor(true);

        System.out.println(frog.isPreditor());
    }
}
