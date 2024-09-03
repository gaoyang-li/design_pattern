package observer_pattern.good1;

/**
 * 客户端
 */
public class Main {
    public static void main(String[] args) {
        // 老板 大佬
        Subject boss = new Boss("大佬");
        // 看股票的同事
        Observer college1 = new StockObserver("小明", boss);
        Observer college2 = new StockObserver("小刚", boss);
        // 看电视的同事
        Observer college3 = new TvObserver("小方", boss);
        // 老板登记同事
        boss.attach(college1);
        boss.attach(college2);
        boss.attach(college3);
        // 老板回来
        boss.setAction("大佬回来了");
        // 通知同事
        boss.notifyColleges();
    }
}
