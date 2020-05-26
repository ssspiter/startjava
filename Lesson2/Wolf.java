public class Wolf {

	private String gender;
	private String name;
	private float weight;
	private String color;
	private int age;

	public String getGender() {
		return gender;
	}

	void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	void setWeight(float weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	void setAge(int age) {
		if (age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public void walk() {
		System.out.println("Волк гуляет по лесу");
	}

	public void seat() {
		System.out.println("Волк сидит");
	}

	public void run() {
		System.out.println("Волк побежал со скроростью 10 км/ч");
	}

	public void howl() {
		System.out.println("Волк провыл на луну 2 часа");
	}

	public void hunt() {
		System.out.println("Волк поймал зайца");
	}
}