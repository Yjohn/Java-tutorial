1.

public class Main {
    public static void main(String[] args) {
    
        Animal frog = new Animal();

        System.out.println(frog.sound);
    }
}

// This class goes in its own separate file
public class Animal {

    String name = "Frog";
    int numberOfLegs = 4;
    String sound = "Ribbit!";
    String color = "Green";
    boolean isPreditor = false;
    
}


2.
    
public class Main {
    public static void main(String[] args) {
        Animal frog = new Animal();
        frog.makeNoise();
    }
}

// This class goes in its own separate file
public class Animal {

    String name = "Frog";
    int numberOfLegs = 4;
    String sound = "Ribbit!";
    String color = "Green";
    boolean isPreditor = false;
    
    public void makeNoise() {
        System.out.println(sound);
    }
}
