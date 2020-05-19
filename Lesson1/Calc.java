public class Calc {
    
    public static void main(String[] args) {
        int i = 8, j = 4;
        int result = 0;
        char symbol = '^'; //заменитель введенного символа

        System.out.println("Введите первое число");
        System.out.println("Первое число " + i);
        System.out.println("Введите второе число");
        System.out.println("Второе число " + j);
        System.out.println("Укажите математическую операцию");
        System.out.println("Операция: " + symbol);

        if (i >= 0 && j >= 0) {
            if (symbol == '+') {
                result = i + j;
            } else if (symbol == '-') {
                    result = i - j;
            } else if (symbol == '*') {
                    result = i * j;
            } else if (symbol == '/') {
                    result = i / j;
            } else if (symbol == '^') {
                    result = i;
                    int m = j;
                    while (m > 1) {
                        result *= i;
                        m--;
                    }
            } else if (symbol == '%') {
                    result = i % j;
            }
            System.out.println("Результат вычисления " + i + symbol + j + "=" + result);
        } else 
            System.out.print("Вы ввели отрицательное число");
    }
}
