package simple_factory_pattern.good;

public class Multiply extends Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA * numberB;
    }
}
