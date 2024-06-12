class Pattern6 {
	public static void main(String args[]) {
		int sp = 20;
		for (int i = 5; i >= 1; i--) {
			for (int k = 5; k <= sp; k++) {
				System.out.print(" ");
			}
			sp++;
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}