package observer_pattern.bad1;

/**
 * 客户端
 */
public class Main {
    public static void main(String[] args) {
        // 前台人
        Secretary secretary = new Secretary("前台哥");

        // 看股票的同事
        StockObserver college1 = new StockObserver("同事A", secretary);
        StockObserver college2 = new StockObserver("同事B", secretary);

        // 前台登记同事
        secretary.attach(college1);
        secretary.attach(college2);

        // 发现老板回来的时候
        secretary.setAction("老板回来了");

        // 通知同事
        secretary.notifyColleges();
    }
}
