package simple_factory_pattern.good;

public class Addition extends Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA + numberB;
    }
}