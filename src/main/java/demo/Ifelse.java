package demo;

import java.util.Scanner;

public class Ifelse {
//	public static void main(String arg[]) {
//		int age = 20;
//		if (age > 21) {
//			System.out.print("You are born in 19th");
//		} else {
//			System.out.print("You born in 20");
//		}		
//	}

	//public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.print("Enetr year : ");
		year = sc.nextInt();

		if (year % 4 == 0 && year % 100 != 00) {
			System.out.println("This is a leap year....");
		} else {
			System.out.println("This is not a leap year....");
		}
	}
}
