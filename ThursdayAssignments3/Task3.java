import java.util.Random;

class Task3 {

	public static void main(String[] args) {
		//mathDivisible(5);
		//getRandom();
		recursion(10);
	}

	public static void mathDivisible(int number) {
		for (int i = 1; i <= 100; i++)
			if (i%5 == 0) {
				System.out.println(i);
			}
	}

	public static int getRandom() {
		int[] arr = new int[] { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };
		Random rnd = new Random();
		System.out.println("Random number from the array = "+arr[rnd.nextInt(arr.length)]);
		return arr[rnd.nextInt(arr.length)];
	}

	public static void recursion(int num) {
		System.out.println("The number is "+num);
		while (num > -1) {
			System.out.println(num);
			num--;
		}
	}
}