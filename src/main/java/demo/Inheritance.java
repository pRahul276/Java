package demo;

public class Inheritance {
	public static void main(String arg[]) {
		Bike bike = new Bike();
		bike.make = "Honda";
		bike.horn();
		bike.horn(bike.make, bike.model);

		// Runtime Polymorphism
		Vehical v; // Upper Casting
		v = new Car();
		v.fuel();

		Car car = new Car();
		car.horn("Honda", "Civic", "Sport");

	}

}

class Vehical {
	String make = "";
	String model = "";

	public Vehical() {

	}

	Vehical(String mKe, String model) {
		this.make = mKe;
		this.model = model;
	}

	void horn() {
		System.out.println("PPPPPPPPPPppppppp.....");
	}

	void fuel() {
	}
}

class Bike extends Vehical {

	Bike() {
		super();
	}

	Bike(String mKe, String model) {
		super(mKe, model);
	}

	void horn(String make, String model) {
		System.out.println(" This functionallity is not in this :" + make + " " + model);
	}
}

class Car extends Vehical {
	String trim = "";

	Car() {

	}

	Car(String mke, String model, String trim) {
		super(mke, model);
		this.trim = trim;
	}

	// Example of method overloading
	void horn(String make, String model, String trim) {
		System.out.println(" This functionallity is not in this :" + make + " " + model + " " + trim);
	}

	// Example of method overriding
	void fuel() {
		System.out.println(" Fuel Type is Petrol");
	}

}
