package factory_3.factory3;

/**
 * 为宝马123生产配件
 */
public class FactoryBMW123 implements Factory {
    @Override
    public Engine createEngine() {
        return new Engine123();
    }

    @Override
    public Aircondition createAirCondition() {
        return new Aircondition123();
    }
}
