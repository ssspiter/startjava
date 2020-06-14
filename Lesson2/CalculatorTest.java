import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Calculator example = new Calculator();
        Scanner scan = new Scanner(System.in);
        String run;
        
        do {
            System.out.print("Введите первое число: ");
            example.setNum1(scan.nextInt());
            System.out.println();

            System.out.print("Введите второе число: ");
            example.setNum2(scan.nextInt());
            System.out.println();

            System.out.print("Укажите математическую операцию: ");
            example.setOperation(scan.next().charAt(0));
            System.out.println();

            example.calculate();
            System.out.print("Результат вычисления: " + example.getNum1() + example.getOperation());
            System.out.println(example.getNum2() + "=" + example.getResult());
            
            do {
                System.out.print("Хотите продолжить? (Y/N): ");
                run = scan.next();

                if (run.equalsIgnoreCase("Y")) {
                    break;
                } else {
                    if (run.equalsIgnoreCase("N")) {
                        break;
                    }
                }
            }while (true);

        } while (!"N".equalsIgnoreCase(run));
        System.out.println();
    }
}