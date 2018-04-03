public class TestClass
{
    public static void main(String[] args) {
        int[] numbers = {1,24,67,32,9,54,2};

        int biggestNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > biggestNumber) {
                biggestNumber = numbers[i];
            }
        }

        System.out.println("Biggest Number = " + biggestNumber);
    }
}
