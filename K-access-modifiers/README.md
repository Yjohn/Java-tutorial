# Reading Material

- Access modifiers ~ https://www.tutorialspoint.com/java/java_access_modifiers.htm

Usually, the member variables (fields) inside a class are all private. This means that no outside class is able to read or write over them. That is why we use getters and setters - it is a way to control how and when the outside world is able to interact with the class' data.

For instance, if we want to set a new value for a field, if we use a setter, we are able to put the new value through differenct checks to make sure it is a legitimate value. 

While the fields of a class are almost always private, a class' methods need to be determined public or private on a case by case basis. Private methods will only be available inside the same class. For instance, you may have a public setter method that calls a private method that will make sure the value is what you are expecting:
```

// public method is open to the world
public void setNumber(int number) {
    
    // check if value is what we're expecting
    if (isLegitNumber(number)) {
        // update field 
        this.number = number;
    }
    else {
        // throw an error
    }
}

// private method can only be called within the same class
private boolean isLegitNumber(int number) {

    // perform some check
    if (number < 0) {
       return false;
    }
    else {
        return true;
    }

}

```
