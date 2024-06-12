class Pattern7 {
	public static void main(String args[]) {
		int sp = 20;
		int i, j, k;
		for (i = 1; i <= 5; i++) {
			for (k = 1; k <= sp; k++) {
				System.out.print(" ");
			}
			sp--;
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sp = 20;
		for (i = 4; i >= 1; i--) {
			for (k = 4; k <= sp; k++) {
				System.out.print(" ");
			}
			sp++;
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}