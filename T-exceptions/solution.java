1.
public class Main {
    public static void main(String[] args) {

        try {
            int x = 10 / 0; // this will throw an exception since you cannot divide by zero
        }
        catch (ArithmeticException e) {
            System.out.println("An exception occurred: " + e);
        }

    }
}

2.
public class Main {
    public static void main(String[] args) {

        try {
            int x = 10;
        }
        catch (ArithmeticException e) { // the code in this block will only run when an exception has been thrown
            System.out.println("An exception occurred: " + e);
        }
        finally { // the code in this block will always run, regardless if an exception was thrown or not
            System.out.println("You are in the finally block!");
        }

    }
}

3.
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
            try {
                withdrawMoney(moneyToWithdraw);
            }
            catch (Exception e) {
                System.out.println("******************");
                System.out.println("ERROR: An error has occurred! Please try again.");
                System.out.println("******************");
                System.out.println();
            }
        }

    }

    public static void withdrawMoney(double moneyToWithdraw) throws Exception {
        if (moneyToWithdraw > totalMoney) {
            // throw an exception here, because we do not want the user to withdraw more money than he has
            throw new Exception();
        }

        totalMoney = totalMoney - moneyToWithdraw;
    }

}
