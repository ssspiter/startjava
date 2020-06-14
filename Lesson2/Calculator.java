public class Calculator {

    private int num1, num2, result;
    private char operation;

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getResult() {
        return result;
    }

    public char getOperation() {
        return operation;
    }

    void setNum1(int num1) {
        this.num1 = num1;
    }

    void setNum2(int num2) {
        this.num2 = num2;
    }

    void setResult(int result) {
        this.result = result;
    }

    void setOperation(char operation) {
        this.operation = operation;
    }

    public void calculate() {
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