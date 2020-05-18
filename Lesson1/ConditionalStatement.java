public class ConditionalStatement {

	public static void main(String[] args) {
		
		int age = 44;
		if (age > 20) {
			System.out.println ("Ура, ваш возраст больше 20");
		}

		String gender = "man";
		if (gender == "man") {
			System.out.println ("Вы мужчина, и это прекрасно");
		}
	
		if (gender != "man") {
			System.out.println ("Вы женщина, и это великолепно");
		}

		float height = 1.72f;
		if (height < 1.8) {
			System.out.println ("Вы не высокого роста, это ваше преимущество");
		} else {
			System.out.println ("Вы высокого роста, это ваше преимущество");
		}

		char firstNameChar = 'S';
		if (firstNameChar == 'M') {
			System.out.println ("Первая буква вашего имени - M");
		}
		else if (firstNameChar == 'I') {
			System.out.println ("Первая буква вашего имени - I");
		} else {
			System.out.println ("Ваше имя не начинается ни с M, ни с I");
		}
	}
}
