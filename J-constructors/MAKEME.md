# Homework

### 1. Define a contstructor in the Animal class that has a parameter to pass in a value for the animal's _color_. Then set the animal's private field value _color_ to the parameter's value.
```
public class Animal {

    String name = "Frog";
    int numberOfLegs = 4;
    String sound = "Ribbit!";
    String color = "Green";
    boolean isPreditor = false;
    
    // Define constructor here

    public void makeNoise() {
        System.out.println(sound);
    }

}
```

### 2. Instantiate an Animal object in your Main class using the new constructor. Pass in "Red" as the constructors argument. You can then display the Animal's color to see if it was set correctly.
```
public class Main {
    public static void main(String[] args) {
        Animal frog = // use new constructor
        
        // display the frog's color here
    }
}
```

### 3. Define another constructor that takes all of the Animal's fields as parameters and sets them equal to the parameters values
