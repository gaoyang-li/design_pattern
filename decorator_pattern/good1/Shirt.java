package decorator_pattern.good1;

// ConcreteDecorator
public class Shirt extends Cloth {
    @Override
    public void show() {
        System.out.print(" 衬衫");
        super.show();
    }
}
