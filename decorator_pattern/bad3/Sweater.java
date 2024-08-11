package decorator_pattern.bad3;

// ConcreteDecorator
public class Sweater extends Cloth{
    @Override
    public void show(){
        System.out.print(" 毛衣");
        super.show();
    }
}
