# Homework

Consider this class:
```
public class Car {

	private String make;
	private String model;
	private int year;
	private String color;

	public Car(String make, String model, int year, String color) {
		this.make = make;
		this.model = model;
		this.color = color;

		if (isValidYear(year)) {
			this.year = year;
		}
	}
  
  public void makeSound() {
    System.out.println("BEEP BEEP");
  }
  
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (isValidYear(year)) {
			this.year = year;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	private boolean isValidYear(int year) {
		if (year >= 1885) {
			return true;
		}
		else {
			return false;
		}
	}
}
```
### 1. Create a class _SportsCar_ that overrides the _makeSound_ method and prints out something more suitable for a fast car

### 2. Create an instance of a Car and a SportsCar in your _main_ method. Call the _makeSound_ method on each object and compare the differences. What happens if you create a 3rd object using `Car car3 = new SportsCar()` and call the _makeSound_ method?
