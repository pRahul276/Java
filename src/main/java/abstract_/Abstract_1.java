package abstract_;

interface Vehical {
	void horn();

	void light();

	void fuel();

	static void price() {
		System.out.println("300000");
	}
}

abstract class Bike implements Vehical {
	public Bike() {
		System.out.println("This is the constructor of Abstract class");
	}

	public void horn() {
		System.out.println("PPPPPPPPPPPpppppppppppppppp...............");
	}

	abstract void run();

	void display() {
		System.out.println("This is the display of Abstarct class ");
	}
}

class Honda extends Bike {
	void run() {
		System.out.println("Bike is running....");
	}

	public void light() {
		System.out.println("Light is Auto-matic");

	}

	public void fuel() {
		System.out.println("This is an E-Bike");

	}

//	void display() {
//		System.out.println("This is the display of Extended class ");
//	}
}

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing....");
	}
}

class Round extends Shape {
	void draw() {
		System.out.println("Drawing  round......");
	}
}

public class Abstract_1 {
	public static void main(String arg[]) {
		Bike bike = new Honda(); // running constructor of abstract class by default
		bike.run(); // calling abstract method
		bike.display(); // calling non abstract method, we can not override non-abstract method of
						// abstract class
		bike.horn();
		bike.fuel();

		Vehical vehical = new Honda();
		vehical.light();
		Vehical.price();     //I can direct access the static method of an interface

		Shape shape = new Rectangle();
		shape.draw();
		shape = new Round();
		shape.draw();
	}
}
