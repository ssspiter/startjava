public class Cycle {

	public static void main(String[] args) {
		int i;
		int m = 6;
		int n = 10;
		int l = 0;

		for (i = 0; i <= 20; i++) {
			System.out.print (i + " ");
		}
		System.out.println ();

		while (m >= -6) {
			System.out.print (m + " ");
			m -= 2;
		}
		System.out.println ();

		do {
            if (n%2 == 0) {
                n++;
            }
            else {
                l += n;
                n++;
            }
        }
        while (n <= 20);
        System.out.println(l);
		
	}

}