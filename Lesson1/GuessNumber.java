public class GuessNumber {

	public static void main(String[] args) {
		int guessedNumber = 72;
		int shot = 56;
		System.out.println("Компьютер загадал число в интервале 0 - 100");
		System.out.println("Угадай какое это число, введи вариант");
		System.out.println("Ваше число: " + shot);
		
		if (shot > guessedNumber) {
			while (shot > guessedNumber) {
				System.out.println("Ваше число больше загаданного. Введите новое число");
				shot --;
				System.out.println("Ваше число: " + shot);
			}
		} else { 
			while (shot < guessedNumber) {
				System.out.println("Ваше число меньше загаданного. Введите новое число");
				shot ++;
				System.out.println("Ваше число: " + shot);
			}
		}
		System.out.println("Вы угадали, загаданное число: " + shot);
	}
}