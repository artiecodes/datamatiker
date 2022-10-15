class Task2 {
	
	public static void printPartOfWord(String word, int startIndx, int endIndx) {

		System.out.println(word.substring(startIndx,endIndx+1));

	}

	public static void main (String[] args) {

		printPartOfWord("København", 1, 4);
	}
}