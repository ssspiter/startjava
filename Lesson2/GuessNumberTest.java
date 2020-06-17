import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player();
		GuessNumber game = new GuessNumber();
		Scanner scan = new Scanner(System.in);
		String answer;
		
		System.out.println("Игра Угадай число");
		
		System.out.print("Введите имя первого игрока: ");
		player1.setName(scan.next());
		System.out.println();
		System.out.print("Введите имя второго игрока: ");
		player2.setName(scan.next());
		System.out.println();

		System.out.println("Компьютер загадал целое число от 1 до 100, угадайте его");

		do {
			System.out.print(player1.getName() + ", введите ваше число: "); 
			game.compare(scan.nextInt());
			System.out.println(game.result);
			if (game.result.equals("Вы угадали!")) {
				System.out.println(player1.getName() + " - ПОБЕДИТЕЛЬ!!!");
				break;
			} else {
				System.out.print(player2.getName() + ", введите ваше число: "); 
				game.compare(scan.nextInt());
				System.out.println(game.result);
				if (game.result.equals("Вы угадали!")) {
					System.out.println(player2.getName() + " - ПОБЕДИТЕЛЬ!!!");
					break;
				} else {
					do {
                		System.out.print("Хотите продолжить? (Y/N): ");
                		answer = scan.next();
            		} while (!answer.equalsIgnoreCase("Y") && !answer.equalsIgnoreCase("N"));
				}
			}
		} while (!game.result.equals("Вы угадали!"));
	}
}