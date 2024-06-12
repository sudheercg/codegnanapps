class Pattern24 {
	public static void main(String args[]) {
		int i, j, r, k = 1;
		r = 10;
		System.out.print("FLOYD'S TRIANGLE\n\n");
		for (i = 1; i <= r; i++) {
			for (j = 1; j <= i; j++, k++)
				System.out.print(k);
			System.out.print("\n");
		}
	}
}
