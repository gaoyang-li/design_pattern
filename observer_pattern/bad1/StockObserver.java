package observer_pattern.bad1;

/**
 * 看股票的同事类
 */
public class StockObserver {
    private String name;
    private Secretary subject;

    public StockObserver(String name, Secretary subject) {
        this.name = name;
        this.subject = subject;
    }

    public void update() {
        System.out.println(this.subject.name + ": " + this.subject.getAction() + "! " + this.name + ", 关闭股票赶紧工作");
    }
}
