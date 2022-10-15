class Task4 {
	public static void main (String[] args) {
		fibonacci(1,1);
	}

	public static void fibonacci (int a, int b) {
		System.out.println(a+ "\t");
		if (b < 1000) {
			fibonacci(b, b+a);
		}
	}
}