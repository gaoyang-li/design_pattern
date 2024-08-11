package simple_factory_pattern.bad.bad2;

public class Operation {
    public static double getResult(double numberA, double numberB, String operator) {
        double result = 0d;
        switch (operator) {
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            case "*":
                result = numberA * numberB;
                break;
            case "/":
                result = numberA / numberB;
                break;
        }
        return result;
    }
}
