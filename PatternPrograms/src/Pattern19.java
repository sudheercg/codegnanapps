class Pattern19 {
	public static void main(String args[]) {
		int i, j, k;
		for (i = 1; i <= 5; i++) {
			j = i;
			for (k = 1; k <= i; k++) {
				System.out.print(j++);
			}
			System.out.print("\n");
		}
	}
}