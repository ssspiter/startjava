public class ConditionalStatement {

	public static void main(String[] args) {
	int age = 44;
	String gender = "man";
	float height = 1.72f;
	char firstNameChar = 'S';

	if (age > 20){
		System.out.println ("Ура, ваш возраст больше 20");
	}

	if (gender == "man"){
		System.out.println ("Вы мужчина, и это прекрасно");
	}
	
	if (gender != "man") {
		System.out.println ("Вы женщина, и это великолепно");
	}
	
	if (height < 1.8) {
		System.out.println ("Вы не высокого роста, это ваше преимущество");
	}
	else {
		System.out.println ("Вы высокого роста, это ваше преимущество");
	}
	
	if (firstNameChar == 'M') {
		System.out.println ("Первая буква вашего имени - M");
	}
	else if (firstNameChar == 'I') {
		System.out.println ("Первая буква вашего имени - I");
	}
	else {
		System.out.println ("Ваше имя не начинается ни с M, ни с I");
	}

	}
}
