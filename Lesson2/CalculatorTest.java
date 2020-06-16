import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String answer;
        
        do {
            System.out.print("Введите первое число: ");
            calc.setNum1(scan.nextInt());
            System.out.println();

            System.out.print("Укажите математическую операцию: ");
            calc.setOperation(scan.next().charAt(0));
            System.out.println();

            System.out.print("Введите второе число: ");
            calc.setNum2(scan.nextInt());
            System.out.println();

            System.out.println("Результат вычисления: " + calc.calculate());

            do {
                System.out.print("Хотите продолжить? (Y/N): ");
                answer = scan.next();
            } while (!answer.equalsIgnoreCase("Y") && !answer.equalsIgnoreCase("N"));
        } while (!answer.equalsIgnoreCase("N"));
        System.out.println();
    }
}