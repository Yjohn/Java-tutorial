# Homework

### 1. Run your first JUnit test case.
#### In Eclipse, right click your src folder and select _New_->_Junit Test Case_. Name the test case _TestJunit_ and hit _Finish_. Then replace the contents of your new file with this:
```
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestJunit {

	@Test
	public void testAdd() {
		String str = "Junit is working fine";
		assertEquals("Junit is working fine",str);
	}

}
```
#### To run this test case, right click "TestJunit.java" in the Package Explorer and select _Run As_->_Junit Test_. If you do not see "Junit Test" under "Run As", select _Run As_->_Run Configurations_. Double click "JUnit" on the left, and type "TestJunit" under the "Test Class" field, then hit "Run".
#### After running the test, you should see a green bar appear in the JUnit tab. This shows you that the test completed successfully.

### 2. Write a test case for the Animal class
#### For this exercise, you should have 2 files in your project (TestJunit.java & Animal.java). This is how your files should look:
Animal.java
```
public class Animal {

	// attributes - variables
	private String name;
	private String color;
	private int age;

	// actions - methods/functions

	// default constructor
	public Animal() {
		name = "";
		color = "";
		age = 0;
	}

	// overloaded constructor
	public Animal(String newName, String newColor, int newAge) {
		name = newName;
		color = newColor;
		age = newAge;
	}

	private boolean checkAge(int newAge) {
		if (newAge < 200) {
			return true;
		}
		else {
			return false;
		}
	}

	public void setAge(int newAge) {
		if (checkAge(newAge)) {
			age = newAge;
		}
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public void eat() {
		System.out.println("eating");
	}

	public void walking() {
		System.out.println("walking");
	}
}
```
TestJunit.java
```
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestJunit {

}
```
### To complete this program, write a test case method called _testAnimalNameSetter()_. This test case should create a new Animal object, set the name of the animal to some String called newName, compare the animal's name with newName, and _fail()_ the test if they are not equal.
