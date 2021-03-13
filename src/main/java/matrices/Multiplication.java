package matrices;

public class Multiplication {
	public static void main(String args[]) {
		int[][] a = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int[][] b = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int[][] c = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int d = 0, f = 0;
				for (int k = 0; k < 3; k++) {
					f = d;
					d = a[i][k] * b[k][j];
					d = f + d;
				}
				c[i][j] = d;
				System.out.print(" " + c[i][j]);
			}
			System.out.println(" ");

		}
	}

}
