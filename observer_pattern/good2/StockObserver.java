package observer_pattern.good2;

import java.util.Observable;
import java.util.Observer;

/**
 * 看股票同事类
 */
public class StockObserver implements Observer {
    private String name;

    public StockObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {  // 2个参数是原生接口的
        Subject boss = (Subject) o;   // 将Observables转成Boss
        System.out.println(boss.getName() + ": " + boss.getAction() + "! " + this.name + ", 关闭股市");
    }
}
