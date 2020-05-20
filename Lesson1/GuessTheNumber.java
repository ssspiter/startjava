public class GuessTheNumber {

	public static void main(String[] args) {
		int number = 72;
		int variant = 50;
		System.out.println("Компьютер загадал число в интервале 0 - 100");
		System.out.println("Угадай какое это число, введи вариант");
		System.out.println("Ваше число: " + variant);
		
		if (variant > number) {
			while (variant >= number) {
				System.out.println("Ваше число больше загаданного. Введите новое число");
				variant --;
				System.out.println("Ваше число: " + variant);
			}
		} else { 
			while (variant <= number) {
				System.out.println("Ваше число меньше загаданного. Введите новое число");
				variant ++;
				System.out.println("Ваше число: " + variant);
			}
		}
		System.out.println("Вы угадали, загаданное число: " + variant);
	}
}