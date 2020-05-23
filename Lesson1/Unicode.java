public class Unicode {

	public static void main(String[] args) {
		char symbol = 32;
		do {
			System.out.print(symbol++);
		} while (symbol <= 126);
		System.out.println();
	}
}