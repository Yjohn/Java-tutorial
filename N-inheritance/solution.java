public class SportsCar extends Car {

	private int topSpeed;
	private double price;
	private boolean hasRacingStripes;

	public SportsCar(String make, String model, int year, String color, int topSpeed, double price) {
		super(make, model, year, color);
		this.topSpeed = topSpeed;
		this.price = price;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isHasRacingStripes() {
		return hasRacingStripes;
	}

	public void setHasRacingStripes(boolean hasRacingStripes) {
		this.hasRacingStripes = hasRacingStripes;
	}
  
}


public class Main {
    public static void main(String[] args) {
        
        SportsCar mySportsCar = new SportsCar("Tesla", "Model X", 2017, "Black", 155, 140000);
        
        mySportsCar.setColor("Red");

        System.out.println("Color: " + mySportsCar.getYear());
        System.out.println("Top Speed: " + mySportsCar.getTopSpeed());
        System.out.println("Price: " + mySportsCar.getPrice());
        System.out.println("Model: " + mySportsCar.getModel());
        
        // Can't call this method because it is private
        //mySportsCar.isValidYear(250);

    }
}
