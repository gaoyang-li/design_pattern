package factory_3.factory2;

public class FactoryBMW123 implements Factory {
    @Override
    public BMW createBMW() {
        return new BMW123();
    }
}
