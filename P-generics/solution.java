1. 
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList list = new ArrayList<String>();
        list.add("hi");
        displayAnything(list);

    }

    public static <T> void displayAnything(T t) {
        System.out.println("t = " + t);
    }

}

