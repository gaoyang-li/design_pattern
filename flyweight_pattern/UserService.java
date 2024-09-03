package flyweight_pattern;

/**
 * 用户服务
 */
public class UserService {
    public void service() {
        // 通过享元工厂拿到DatabaseUtil对象
        DatabaseUtil util = DBUtilFactory.getFlyweight();
        // 数据库操作
        util.selectDB();
    }
}
