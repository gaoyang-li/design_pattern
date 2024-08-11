package decorator_pattern.bad3;

// Decorator
// 服饰类
public class Cloth implements Character {
    protected Character component;

    public void decorate(Character component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (this.component != null) {
            this.component.show();
        }
    }
}
