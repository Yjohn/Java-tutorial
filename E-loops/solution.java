1.
public class TestClass {
    public static void main(String[] args)
    {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

2.
public class TestClass {
    public static void main(String[] args)
    {
        int i = 0;
        while (i <= 100) {
          if (i % 2 == 0) {
            System.out.println(i);
          }
          i += 1;
        }
    }
}

3.
public class TestClass {
    public static void main(String[] args)
    {
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        for (int i : intArray) {
            System.out.println("i = " + i);
        }
    }
}

4.
public class TestClass {
    public static void main(String[] args)
    {
        
       for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
       }
        
    }
}
