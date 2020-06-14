public class JaegerConstructorTest {

	public static void main(String[] args) {
		JaegerConstructor robot1 = new JaegerConstructor("Gipsy Avenger", "Mark-6", "January 12, 2034", 2.004f, 81.77f, "Street Fighter");
		JaegerConstructor robot2 = new JaegerConstructor("Guardian Bravo", "Mark-6", "December 15, 2033", 1.975f, 73.21f, "Counter Striker");
		
		System.out.println("Model Name: " + robot1.getModelName());
		System.out.println("Mark: " + robot1.getMark());
		System.out.println("Weight: " + robot1.getWeight());
		System.out.println("Height: " + robot1.getHeight());
		System.out.println("Launched: " + robot1.getLaunched());
		System.out.println("Body Language: " + robot1.getBodyLanguage());
		System.out.println();

		System.out.println("Model Name: " + robot2.getModelName());
		System.out.println("Mark: " + robot2.getMark());
		System.out.println("Weight: " + robot2.getWeight());
		System.out.println("Height: " + robot2.getHeight());
		System.out.println("Launched: " + robot2.getLaunched());
		System.out.println("Body Language: " + robot2.getBodyLanguage());
		System.out.println();

	}
}