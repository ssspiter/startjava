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

	public String getModelName() {
		return modelName;
	}

	public String getMark() {
		return mark;
	}

	public String getLaunched() {
		return launched;
	}

	public String getBodyLanguage() {
		return bodyLanguage;
	}

	public float getWeight() {
		return weight;
	}

	public float getHeight() {
		return height;
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
}