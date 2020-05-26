public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.setGender("кабель");
		wolfOne.setName("Вожак");
		wolfOne.setWeight(42.2f);
		wolfOne.setColor("серый");
		wolfOne.setAge(7);

		System.out.print("Волк по кличке " + wolfOne.getName() + ", " + wolfOne.getGender());
		System.out.print(", цвет " + wolfOne.getColor() + ", вес " + wolfOne.getWeight());
		System.out.println(", Возраст " + wolfOne.getAge() + " лет");

		wolfOne.walk();
		wolfOne.hunt();
	}
}