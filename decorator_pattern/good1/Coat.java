package decorator_pattern.good1;

// ConcreteDecorator
public class Coat extends Cloth {
    @Override
    public void show() {
        System.out.print(" 外套");
        super.show();
    }
}
