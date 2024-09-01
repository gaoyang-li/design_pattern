package factory_3.factory3;

/**
 * 创建工厂的接口
 */
public interface Factory {
    // 制造引擎
    public Engine createEngine();

    // 制造空调
    public Aircondition createAirCondition();
}
