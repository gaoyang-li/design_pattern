package observer_pattern.bad1;

import java.util.ArrayList;
import java.util.List;

/**
 * 秘书类
 */
public class Secretary {
    protected String name;

    public Secretary(String name) {
        this.name = name;
    }

    // 同事列表
    private List<StockObserver> list = new ArrayList<>();
    private String action;

    // 增加同事 (有几个同事需要通知, 就增加几个对象)
    public void attach(StockObserver observer) {
        list.add(observer);
    }

    // 通知同事
    public void notifyColleges() {
        for (StockObserver observer : list) {
            observer.update();
        }
    }

    // 设置状态 (设置具体通知的话)
    public void setAction(String value) {
        this.action = value;
    }

    // 得到状态
    public String getAction() {
        return this.action;
    }
}
