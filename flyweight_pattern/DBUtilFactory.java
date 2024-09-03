package flyweight_pattern;

public class DBUtilFactory {
    // 享元对象被存放在工厂中
    private static final DatabaseUtil UTIL = new DatabaseUtil();

    // 获取享元对象
    public static DatabaseUtil getFlyweight() {
        return UTIL;
    }
}
