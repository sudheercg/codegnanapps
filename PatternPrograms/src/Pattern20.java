class Pattern20 {
	public static void main(String args[]) {
		int i, j;
		for (i = 1; i <= 4; i++) {
			for (j = i; j > 1; j--)
				System.out.print(j);
			for (j = 1; j <= i; j++)
				System.out.print(j);
			System.out.print("\n");
		}
	}
}
