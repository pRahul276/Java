package demo;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number to Print Prime Series : ");
		int n = sc.nextInt();
		String pn = "2 3 ";

		for (int i = 1; i <= n; i++) {
			int c = 0;
			if (i % 2 != 0 && i % 3 != 0) {
				for (int j = i; j >= 2; j--) {
					if (i % j == 0) {
						c = c + 1;
					}
				}

			}
			if (c == 1) {
				pn = pn + i + " ";
			}
		}
		System.out.print(pn);
	}

}
