package factory_3.factory3;

public class Customer {
    public static void main(String[] args) {
        Factory factoryBMW123 = new FactoryBMW123();
        factoryBMW123.createEngine();
        factoryBMW123.createAirCondition();

        Factory factoryBMW456 = new FactoryBMW456();
        factoryBMW456.createEngine();
        factoryBMW456.createAirCondition();
    }
}
