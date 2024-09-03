package observer_pattern.good1;

/**
 * 看股票同事类
 */
public class StockObserver extends Observer {
    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(super.getSubject().getName() + ": " + super.getSubject().getAction() + "! " + super.getName() + ", 关闭股市");
    }
}
