class factorial{
	public static void main(String[] args) {
		int n=7;
		int i;
		int factorial = 1;
		for (i=n;i>=1; i--) {
			factorial= factorial* i;
		}
		System.out.println("n=7");
		System.out.println("n! ="+factorial);
	}
}