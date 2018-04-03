# Homework

### 1. Finish this class by including a getter and a setter for each field in the class

```
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

}
```

### 2. Use the corresponding setter method to set the frog's _isPreditor_ value to _true_. Then use the getter method to display the value to console.
```
public class Main {
    public static void main(String[] args) {
        Animal frog = new Animal("Red");
        
        // use setter for isPreditor to change value to true
        
        // display frog's isPreditor value by calling the getter method

    }
}

```
