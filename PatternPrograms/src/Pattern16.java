class Pattern16 {
	public static void main(String args[]) {
		int i, j = 5, k, x;
		for (i = 1; i <= 5; i++) {
			for (k = 1; k <= j; k++) {
				System.out.print(" ");
			}
			for (x = 1; x <= i; x++) {
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.print("\n");
			j = j - 1;
		}
	}
}
