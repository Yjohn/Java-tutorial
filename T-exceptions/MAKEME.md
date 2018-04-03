# Homework

### 1. Complete this program so when it breaks it does not exit the program, but instead prints out a message that an exception has been thrown. Use a try/catch block.
```
public class Main {
    public static void main(String[] args) {

        int x = 10 / 0; // this will throw an exception since you cannot divide by zero

    }
}
```

### 2. Using the code solution from the previous question, append a _finally_ block after the try/catch and print out a statement letting you know the code in the _finally_ block is running. After this, run the program, using `int x = 10 / 0;`. Then change it to `int x = 10;` and run it again. When was the code in the _catch_ block run? When was the code in the _finally_ block run?

### 3. Exception handling can be passed off to other methods, so you do not need to deal with them where they occur. Sometimes it makes more sense to throw an exception up your chain of method calls and deal with it there. 
### The program below acts like an ATM and allows the user to withdraw money from his or her bank account. Complete this program by throwing a new exception if the user tries to withdraw more money than he or she has. We will also need to wrap the method call in a try/catch block in case that exception is thrown from the method
```
import java.util.Scanner;

public class Main {

    public static double totalMoney = 100.00;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("******************");
            System.out.println("Your total is: " + totalMoney);
            System.out.println("******************");

            System.out.println("How much would you like to withdraw?");

            double moneyToWithdraw = scanner.nextDouble();
            
            // will need to wrap this in a try/catch
            withdrawMoney(moneyToWithdraw);
        }

    }

    public static void withdrawMoney(double moneyToWithdraw) {
        if (moneyToWithdraw > totalMoney) {
            // throw an exception here, because we do not want the user to withdraw more money than he has
        }

        totalMoney = totalMoney - moneyToWithdraw;
    }

}
```
