# Homework

## 1.
Complete this program to find and display the biggest number in the array
```
public class TestClass
{
    public static void main(String[] args) {
      int[] numbers = {1,24,67,32,9,54,2};

      for (int i = 0; i < numbers.length; i++) {
          int biggestNumber = numbers[i];
      }

      System.out.println("Biggest Number = " + biggestNumber);
    }
}
```

## 2.
Review this program to see why the variable with the same name is displayed with a different value
```
public class TestClass
{
    static String myName = "Thomas";

    public static void main(String[] args) {

        displayName();

        String myName = "Stewart";

        System.out.println("myName = " + myName);
    }
    
    public static void displayName() {
        System.out.println("myName = " + myName);
    }
}
```
