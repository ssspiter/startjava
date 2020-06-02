import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Calculator set = new Calculator();
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.print("Введите первое число: ");
            set.num1 = scan.nextInt();
            System.out.println();

            System.out.print("Введите второе число: ");
            set.num2 = scan.nextInt();
            System.out.println();

            System.out.print("Укажите математическую операцию: ");
            set.operation = scan.next().charAt(0);
            System.out.println();

            set.calculation();
            System.out.println("Результат вычисления: " + set.num1 + set.operation + set.num2 + "=" + set.result);
            System.out.print("Хотите продолжить? (Y/N): ");
        } while (!"N".equals(scan.next()));
        System.out.println();
    
    }
}
