import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args) {
        int[] numbers = {1,24,67,32,9,54,2};

        int biggestNumber = 0;
        ArrayList<Integer> myList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > biggestNumber) {
                myList.add(numbers[i]);
            }
        }

        System.out.println(myList.toString());
    }
}


import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args) {
        int[] numbers = {1,24,67,32,9,54,2};

        ArrayList<Integer> myList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            myList.add(numbers[i]);
        }

        Collections.sort(myList);
        System.out.println(myList.toString());
    }
}

3. 
public class Main 
{
    public static void main(String[] args) {
        
        int[][] myArray = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10}
        };
        
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j]);
            }
            System.out.println();
        }
        
    }
}
