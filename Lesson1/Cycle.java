public class Cycle {
	
	public static void main(String[] args) {
		int i;
		for (i = 0; i <= 20; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int m = 6;
		while (m >= -6) {
			System.out.print(m + " ");
			m -= 2;
		}
		System.out.println();
		
		int n = 10;
		int sum = 0;
		do {
			if (n % 2 == 0) {
			} else {
				sum += n;
			}
			n++;
		}
		while (n <= 20);
		System.out.println(sum);
	}
}