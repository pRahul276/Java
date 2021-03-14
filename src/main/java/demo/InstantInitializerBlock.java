/*
 * Instant Initializer Block invoked each times when object of class created
 * * It use to assign value to the instant variable while performing other operation
 */
package demo;

class BB {
	int speed;

	BB() {
		System.out.println("bike Speed is....");
	}

	{
		speed = 100;
		System.out.println("bike Speed is...." + speed);
	}

}

class BB2 extends BB {
	public BB2() {
		super();
	}

	{
		speed = 200;
		System.out.println("bike Speed is...." + speed);
	}
}

public class InstantInitializerBlock {
	public static void main(String args[]) {
		BB bb = new BB(); // Display Speed == 100 first and then Speed is...
		System.out.println(" ");
		BB2 bb2 = new BB2();  //First going to invoke super() IIB this block

	}

}
