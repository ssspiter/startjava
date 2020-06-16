public class Calculator {

    private int num1, num2, result;
    private char operation;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public int calculate() {
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
        return result; 
    }  
}