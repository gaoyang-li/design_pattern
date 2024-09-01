package factory_3.factory3;

/**
 * 为宝马456生产配件
 */
public class FactoryBMW456 implements Factory {
    @Override
    public Engine createEngine() {
        return new Engine456();
    }

    @Override
    public Aircondition createAirCondition() {
        return new Aircondition456();
    }
}
