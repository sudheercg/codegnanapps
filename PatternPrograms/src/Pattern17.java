class Pattern17 {
	public static void main(String args[]) {
		int i, j, k;
		for (i = 1; i <= 5; i++) {
			for (j = 5; j >= 1; j--) {
				if (j <= i)
					System.out.print(j);
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
