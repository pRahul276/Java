package array;

public class ReversArray {
	public static void main(String args[]) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int lengt = a.length;
		int[] b = new int[lengt];

		System.out.println("Original Array   Revers order");
		for (int i = 0; i < lengt; i++) {
			b[i] = a[(lengt - 1) - i];
			System.out.println("        " + a[i] + "         " + b[i]);
		}
	}

}
