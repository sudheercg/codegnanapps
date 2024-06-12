class Pattern14 {
	public static void main(String args[]) {
		int i, j, k, sp = 1;
		for (i = 5; i >= 1; i--) {
			for (k = sp; k >= 0; k--) {
				System.out.print(" ");// only 1 space
			}
			for (j = i; j >= 1; j--) {
				System.out.print("*");
			}
			sp = sp + 1;
			System.out.print("\n");
		}
	}

}