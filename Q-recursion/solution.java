1.
public class Main {
    
    public static void main(String[] args) {

        int answer = factorial(10);
        System.out.println("answer = " + answer);

    }

   public static int factorial(int number) {
        if (number == 1) {
            return 1;
        }
        else {
            return number * factorial(number-1);
        }
   }

}

2.
public class Main {

    static int number1 =0;
    static int number2=1;
    static int number3=0;

    public static void main(String[] args) {

        int count = 20;
        fibonacci(count);
    }

   public static void fibonacci(int count) {
        if (count == 0) {
            return;
        }
        else {
            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
            System.out.println(number3);
            fibonacci(count-1);
        }
   }

}
