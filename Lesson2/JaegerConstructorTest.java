public class JaegerConstructorTest {

	public static void main(String[] args) {
		JaegerConstructor robot1 = new JaegerConstructor("Gipsy Avenger", "Mark-6", "January 12, 2034", 2.004f, 81.77f, "Street Fighter");
		JaegerConstructor robot2 = new JaegerConstructor("Guardian Bravo", "Mark-6", "December 15, 2033", 1.975f, 73.21f, "Counter Striker");
		
		robot1.information();
		robot2.information();

	}
}