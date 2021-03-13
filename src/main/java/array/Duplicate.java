package array;

public class Duplicate {
	public static void main(String args[]) {
		int[] array = { 1, 2, 3, 8, 2, 8, 4, 5, 3 };
		int length = array.length;
		int[] duplicate = new int[length];
		int a = 0, b = 0;

		for (int i = 0; i < length; i++) {
			a = array[i];
			int count = 0;
			for (int j = i; j < length; j++) {

				if (a == array[j]) {
					count++;
				}
				if (count > 1) {
					duplicate[i] = a;
				}
			}
		}

		for (int i = 0; i < length; i++) {
			if (duplicate[i] != 0) {
				System.out.print(" " + duplicate[i]);
			}
		}
	}
}
