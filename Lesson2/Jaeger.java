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