# Reading Material

- Inheritance ~ https://www.javatpoint.com/inheritance-in-java

Inheritance is a term that describes a `parent-to-child relationship`. The idea is that a child Class can _inherit_ all the attributes of the parent. So any non-private fields and methods defined in a parent class are automatically inherited to any child of that class.

### How does inheritance look in Java?
To make a class inherit from a parent class, one just needs to use the `extends` keyword in the Class signature.
For example, if we want a class, Dog, to inherit from our class, Animal, this is how we would define the relationship:
```
public class Dog extends Animal {

}
```
