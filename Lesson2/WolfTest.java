public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.gender = "кабель";
		wolfOne.name = "Вожак";
		wolfOne.weight = 35.6f;
		wolfOne.color = "серый";

		System.out.println("Волк по кличке " + wolfOne.name + ", " + wolfOne.gender + ", цвет " + wolfOne.color + ", вес " + wolfOne.weight);

		wolfOne.walk();
		wolfOne.hunt();
	}
}