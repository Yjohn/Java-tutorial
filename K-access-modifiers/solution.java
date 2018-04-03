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
