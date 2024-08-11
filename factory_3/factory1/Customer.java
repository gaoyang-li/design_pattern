package factory_3.factory1;

public class Customer {
    public static void main(String[] args) {
        Factory factor = new Factory();
        BMW bmw123 = factor.createBMW(123);
        BMW bmw456 = factor.createBMW(456);
    }
}
