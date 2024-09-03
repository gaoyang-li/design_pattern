package observer_pattern.good1;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象通知者
 */
public abstract class Subject {
    private String name;
    private String action;
    // 同事列表
    private List<Observer> list = new ArrayList<>();    // 针对抽象的Observer编程

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

    // 设置状态  设置具体通知的话
    public void setAction(String action) {
        this.action = action;
    }

    // 增加同事  有几个同事需要通知, 就增加几个对象
    public void attach(Observer observer){
        list.add(observer);
    }

    // 减少同事
    public void detach(Observer observer){
        list.remove(observer);
    }

    // 通知
    public void notifyColleges(){
       // 给所有需要被通知的同事发通知
        for (Observer observer: list){
            observer.update();
        }
    }

}
