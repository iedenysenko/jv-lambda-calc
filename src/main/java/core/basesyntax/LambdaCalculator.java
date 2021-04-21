package core.basesyntax;

public class LambdaCalculator implements Calculator {

    @Override
    public double calculate(double firstValue, double secondValue, char operation) {
        switch (operation) {
            case '+':
                return firstValue + secondValue;
            case '-':
                return firstValue - secondValue;
            case '*':
                return firstValue * secondValue;
            case '/':
                if (secondValue == 0) {
                    throw new ArithmeticException("Cannot be divided into zero");
                }
                return firstValue / secondValue;
            case '^':
                return Math.pow(firstValue, secondValue);
            default:
                throw new RuntimeException("Not allowed operation");
        }
    }
}