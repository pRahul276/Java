package demo;
/*The covariant return type may vary in the same direction as subclass.
 * * before Java 5 it wasn't possible in method overriding.
 * * * In short over ride the method by changing the return type. 
 * */

class A {
	A get() {
		return this;
	}
}

class B extends A {
	B get() {
		return this;
	}

	void message() {
		System.out.println("This is a demo for covariant..");
	}
}

public class CoverientReturnType {
	public static void main(String args[]) {
		new B().get().message();
	}

}
