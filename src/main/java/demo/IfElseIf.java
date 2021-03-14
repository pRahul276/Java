package demo;

import java.util.Scanner;

public class IfElseIf {
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter your grade : ");
//		int n = sc.nextInt();
//		if (n >= 90 && n <= 100) {
//			System.out.print("Your performance is exclent");
//		} else if (n >= 70 && n < 90) {
//			System.out.print("Your performance is good");
//		} else if (n >= 50 && n < 70) {
//			System.out.print("Your performance is modirate");
//		} else {
//			System.out.print("Your performance is poor");
//		}
//	}

	//public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number : ");
		Float n = sc.nextFloat();

		if (n > 0) {
			System.out.println("Number is Positive");
		} else if (n == 0) {
			System.out.print("Number is Zero");
		} else {
			System.out.print("Number is Negative");
		}

	}
}
