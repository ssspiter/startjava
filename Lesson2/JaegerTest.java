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
		
		robot1.information();
		robot2.information();

	}
}