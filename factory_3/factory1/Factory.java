package factory_3.factory1;

/**
 * 工厂类角色
 */
public class Factory {
    public BMW createBMW(int type) {
        switch (type) {
            case 123:
                return new BMW123();
            case 456:
                return new BMW456();
        }
        return null;
    }
}
