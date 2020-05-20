public class PrintUnicode {

	public static void main(String[] args) {
		char symbol = 33;
		do {
			System.out.print(symbol);
			symbol ++;
		} while (symbol <= 126);
		System.out.println();
	}
}