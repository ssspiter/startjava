public class JaegerTest {

	public static void main(String[] args) {
		Jaeger robot1 = new Jaeger();
		Jaeger robot2 = new Jaeger();
		robot1.setModelName("Gipsy Avenger");
		robot1.setMark("Mark-6");
		robot1.setLaunched("January 12, 2034");
		robot1.setWeight(2.004f);
		robot1.setHeight(81.77f);
		robot1.setBodyLanguage("Street Fighter");

		robot2.setModelName("Guardian Bravo");
		robot2.setMark("Mark-6");
		robot2.setLaunched("December 15, 2033");
		robot2.setWeight(1.975f);
		robot2.setHeight(73.21f);
		robot2.setBodyLanguage("Counter Striker");
		
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