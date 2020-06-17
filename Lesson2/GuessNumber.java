public class GuessNumber {

	int guessedNumber = (int) (Math.random()*100);
	int num;
	String result, name;

	public String compare(int num) {
		if (num == guessedNumber) {
			result = "Вы угадали!";
		}else {
			if (num < guessedNumber) {
				result = "Ваше число меньше загаданного";
			}else {
				result = "Ваше число больше загаданного";
			}
		}
		return result;
	}
}