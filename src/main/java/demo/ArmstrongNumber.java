package demo;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void maain(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n = sc.nextInt();
		int r, a;
		int temp = n;
		int b = 0;
		while (n > 0) {
			r = n % 10;
			a = n / 10;
			b = b + (r * r * r);
		}
		if (b == temp) {
			System.out.print("This is an ArmstrongNumber");
		} else {
			System.out.print("This is not an ArmstrongNumber");
		}

	}
}
