public class TestClass
{
  public static void main(String[] args)
  {
    sayHello();
  }
  
  public static void sayHello() {
    System.out.println("Hello!");
  }
  
}

public class TestClass
{
  public static void main(String[] args)
  {
    System.out.println(getPhrase());
  }
  
  public static String getPhrase() {
    String phrase = "Hello!";
    
    return phrase;
  }
  
}

public class TestClass
{
  public static void main(String[] args)
  {
    String phrase = "Hello!";
    sayPhrase(phrase);
  }
  
  public static void sayPhrase(String phrase) {
    System.out.println(phrase);
  }
  
}
```
