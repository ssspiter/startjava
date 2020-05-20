public class Calculator {
    
    public static void main(String[] args) {
        int num1 = 8, num2 = 4;
        int result = 0;
        char operation = '^'; //заменитель введенного символа

        System.out.println("Введите первое число");
        System.out.println("Первое число " + num1);
        System.out.println("Введите второе число");
        System.out.println("Второе число " + num2);
        System.out.println("Укажите математическую операцию");
        System.out.println("Операция: " + operation);

        if (num1 >= 0 && num2 >= 0) {
            if (operation == '+') {
                result = num1 + num2;
            } else if (operation == '-') {
                    result = num1 - num2;
            } else if (operation == '*') {
                    result = num1 * num2;
            } else if (operation == '/') {
                    result = num1 / num2;
            } else if (operation == '^') {
                    result = num1;
                    int m = num2;
                    while (m > 1) {
                        result *= num1;
                        m--;
                    }
            } else if (operation == '%') {
                    result = num1 % num2;
            }
            System.out.println("Результат вычисления " + num1 + operation + num2 + "=" + result);
        } else 
            System.out.print("Вы ввели отрицательное число");
    }
}
