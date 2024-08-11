package simple_factory_pattern.good;

public class Division extends Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        if (numberB == 0) {
            System.err.println("Divisor cannot be zero");
            throw new ArithmeticException();
        }
        return numberA / numberB;
    }
}
