public class JaegerConstructor {

	private String modelName, mark, launched, bodyLanguage;
	private float weight, height;

	public JaegerConstructor(String modelName, String mark, String launched, float weight, float height, String bodyLanguage) {
		this.modelName = modelName;
		this.mark = mark;
		this.launched = launched;
		this.weight = weight;
		this.height = height;
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