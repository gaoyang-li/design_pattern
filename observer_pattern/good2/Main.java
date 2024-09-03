package observer_pattern.good2;

import java.util.Observer;

/**
 * 客户端
 */
public class Main {
    public static void main(String[] args) {
        // 老板 大佬
        Boss boss = new Boss("大佬");

        // 看股票的同事
        Observer college1 = new StockObserver("小明");
        Observer college2 = new StockObserver("小刚");
        Observer college3 = new TvObserver("小方");

        // 老板登记同事
        boss.addObserver(college1);
        boss.addObserver(college2);
        boss.addObserver(college3);

        // 减去1个同事不通知
        boss.deleteObserver(college1);

        // 老板回来
        boss.setAction("大佬回来了");
    }
}
