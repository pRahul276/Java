package demo;

import java.util.Scanner;

public class NestedIf {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Age : ");
		int age = sc.nextInt();  
		System.out.print("Enter your Weight : ");
		int weight = sc.nextInt();

		if (age >= 20) {
			if (weight > 50) {
				System.out.print("You can donate blood now");

			} else {
				System.out.print("Sorry, your Weight is not enough to donate blood");
			}
		} else {
			System.out.print("Your are under age, Sorry You can't donate");
		}

	}

}
