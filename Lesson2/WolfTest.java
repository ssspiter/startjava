public class WolfTest {

	public static void main(String[] args) {
		Volf volfOne = new Volf();
		volfOne.gender = "кабель";
		volfOne.name = "Вожак";
		volfOne.weight = 35.6f;
		volfOne.color = "серый";

		System.out.println("Волк по кличке " + volfOne.name + ", " + volfOne.gender + ", цвет " + volfOne.color + ", вес " + volfOne.weight);

		volfOne.walk();
		volfOne.hunt();
	}
}