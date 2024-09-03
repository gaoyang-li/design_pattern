package facade_pattern;

/**
 * 添加门面
 */
public class Facade {
    SubSystemA subSystemA = new SubSystemA();
    SubSystemB subSystemB = new SubSystemB();
    SubSystemC subSystemC = new SubSystemC();

    // 外观模式启动
    public void doAll() {
        subSystemA.doService();
        subSystemB.doService();
        subSystemC.doService();
    }
}
