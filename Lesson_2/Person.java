public class Person {

	String male = "man";
	String name = "Егор"
	float height = 1.7f;
	float weight = 80.5f;
	int age = 40;

	void move(){
		System.out.println("пройдено 100 шагов");
	}

	boolean sitDown(){
		System.out.println("Егор сидит");
		return true;
	}

	void run(){
		System.out.println("Егор пробежал 5км");
	}

	String speak() {
		return "Егор сказал: Привет";
	}

	boolean hear() {
		System.out.println("Егор не слушает");
		return false;
	}

	void learnJava() {
		System.out.println("Изучена первая тема");
	}

}