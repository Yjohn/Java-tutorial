1. 
public class SportsCar extends Car {

	public void makeSound() {
		System.out.println("VVVRROOOOOMMMMM");
	}
}

2.
public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        SportsCar sportsCar = new SportsCar();
        Car car3 = new SportsCar();

        car.makeSound(); // BEEP BEEP
        sportsCar.makeSound(); // VVVRROOOOOMMMMM
        car3.makeSound(); // VVVRROOOOOMMMMM

    }

}
