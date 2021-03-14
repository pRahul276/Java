package demo;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number  : ");
		int n = sc.nextInt();
		int num = n;
		int r, a;
		int b = 0;
		while (n > 0) {
			r = n % 10;
			a = n / 10;
			n = a;
			b = r + (10 * b);
		}

		if (b == num) {
			System.out.print("Yes");
		} else {
			System.out.print("NO");
		}
	}
}
