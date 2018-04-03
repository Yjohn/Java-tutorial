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