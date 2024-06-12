class Pattern21 {
	public static void main(String args[]) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				if (j == 5 || j == 1 || i == 1 || i == 5)
					System.out.print("1");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}