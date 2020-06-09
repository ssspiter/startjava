public class Jaeger {

	private String modelName, mark, launched, bodyLanguage;
	private float weight, height;

	void setModelName(String modelName) {
		this.modelName = modelName;
	}

	void setMark(String mark) {
		this.mark = mark;
	}	

	void setLaunched(String launched) {
		this.launched = launched;
	}

	void setWeight(float weight) {
		this.weight = weight;
	}

	void setHeight(float height) {
		this.height = height;
	}

	void setBodyLanguage(String bodyLanguage) {
		this.bodyLanguage = bodyLanguage;
	}

	public void move() {
		System.out.println("Пройдено 10 шагов");
	}

	public String scanKaiju() {
		return "Kaiju not found";
	}

	public void useCanon() {
		System.out.println("Выстрел произведен");
	}

	public void information() {
		System.out.println("Model Name: " + modelName);
		System.out.println("Mark: " + mark);
		System.out.println("Weight: " + weight);
		System.out.println("Height: " + height);
		System.out.println("Launched: " + launched);
		System.out.println("Body Language: " + bodyLanguage);
		System.out.println();

	}

}