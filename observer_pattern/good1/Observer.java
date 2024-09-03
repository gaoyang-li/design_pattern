package observer_pattern.good1;

/**
 * 抽象观察者
 */
public abstract class Observer {
    private String name;
    private Subject subject;

    public String getName() {
        return name;
    }

    public Subject getSubject() {
        return subject;
    }

    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public abstract void update();
}
