public class Calculator {

    int num1, num2, result;
    char operation;

    public void calculation() {

        switch (operation) {
            case '+':
            result = num1 + num2;
            break;

            case '-':
            result = num1 - num2;
            break;

            case '*':
            result = num1 * num2;
            break;

            case '/':
            result = num1 / num2;
            break;

            case '^':
            result = num1;
            int m = num2;
            while (m > 1) {
                result *= num1;
                m--;
            }
            break;

            case '%':
            result = num1 % num2;
            break;
        } 
    }  
}
