package factory_3.factory2;

public class Customer {
    public static void main(String[] args) {
        Factory factoryBMW123 = new FactoryBMW123();
        Factory factoryBMW456 = new FactoryBMW456();
        BMW bmw123 = factoryBMW123.createBMW();
        BMW bmw456 = factoryBMW456.createBMW();
    }
}
