package simple_factory_pattern.good;

public class Subtraction extends Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA - numberB;
    }
}
