package array;

import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		String[] st = new String[5];
		int[] in = { 10, 11, 12, 15, 12 };
		int st_ln = st.length;
		int in_ln = in.length;

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < st_ln; i++) {
			String input = " ";
			System.out.println("Enter String : ");
			input = sc.nextLine();
			st[i] = input;
		}

		for (int i = 0; i < st_ln; i++) {
			System.out.println("String : " + st[i] + " Integer : " + in[i]);
		}
	}

}
