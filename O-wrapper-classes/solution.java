1. 
Autoboxing is the automatic conversion that the Java compiler makes between the 
primitive types and their corresponding object wrapper classes. 
For example, converting an int to an Integer, a double to a Double, and so on. 
If the conversion goes the other way, this is called unboxing.

2.
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);

        String four = "4";
        String five = "5";

        myList.add(Integer.valueOf(four));
        myList.add(Integer.valueOf(five));

        System.out.println(myList.toString());

    }

}
