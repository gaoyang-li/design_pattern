package observer_pattern.good2;

import java.util.Observable;

/**
 * 通知类
 */
public class Subject extends Observable {
    private String name;
    private String action;

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 得到状态
    public String getAction() {
        return action;
    }

    // 设置状态     设置具体通知的话
    public void setAction(String action) {
        this.action = action;
        super.setChanged();         // 改变通知者的状态
        super.notifyObservers();    // 调用父类Observables的方法, 通知所有观察者
    }
}
