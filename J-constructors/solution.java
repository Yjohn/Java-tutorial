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

    public void makeNoise() {
        System.out.println(sound);
    }

}

2.

public class Main {
    public static void main(String[] args) {
        Animal frog = new Animal("Red");

        System.out.println(frog.color);
    }
}

3.

public class Animal {

    String name = "Frog";
    int numberOfLegs = 4;
    String sound = "Ribbit!";
    String color = "Green";
    boolean isPreditor = false;

    Animal(String newColor) {
        color = newColor;
    }

    // note the use of scope in this constructor
    // "this" keyword is used to denote the Animal class -
    // so even though there are multiple variables called "name" within the scope of this method,
    // the parameter "name" has a more direct, smaller scope
    
    Animal(String name, int numberOfLegs, String sound, String color, boolean isPreditor) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.sound = sound;
        this.color = color;
        this.isPreditor = isPreditor;
    }

    public void makeNoise() {
        System.out.println(sound);
    }

}
