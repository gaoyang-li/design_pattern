package observer_pattern.good1;

/**
 * 看电视同事类
 */
public class TvObserver extends Observer {
    public TvObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(super.getSubject().getName() + ": " + super.getSubject().getAction() + "! " + super.getName() + ", 关闭电视");
    }
}
