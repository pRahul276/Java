package array;

public class LargeNumber {
	public static void main(String args[]) {
		int[] a = { 10, 12, 13, 24, 20, 22 };
		int b = 0;
		int length = a.length;
		b = a[0];

		for (int i = 0; i < length; i++) {
			if (a[i] > b) {
				b = a[i];
			}
		}
		System.out.print(" " + b);
	}
}
