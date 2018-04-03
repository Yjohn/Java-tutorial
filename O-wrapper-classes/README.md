# Reading Material

Wrapper Classes ~ https://www.javatpoint.com/wrapper-class-in-java \

Everything in Java is considered an Object. And everything inherits from the Object class. That is why all classes/objects in Java have the `toString()` and `getClass()` methods - they are inherited from the Object class.

The only things in Java that are not classes are primitives. You can tell an object from a primitive by their first letter. If it is capitalized, it is a class (i.e. Car or String). If it starts with a lower-cased letter, it is a primitive (i.e. int, double, boolean).

There are times when a method needs either a primitive or the wrapped version of that primitive. You can get a wrapped value like this:
```
int i = 100;
Integer int1 = new Integer(i);
```
And to get a primitive from a wrapped variable:
```
int x = int1.intValue();
```
You can also use wrapper classes to get a value from a String using the _parseInt()_ method:
```
int x = Integer.parseInt("37"); // x=37 
```
