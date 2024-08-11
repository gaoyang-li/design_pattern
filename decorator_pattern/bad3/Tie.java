package decorator_pattern.bad3;

// ConcreteDecorator
public class Tie extends Cloth{
    @Override
    public void show(){
        System.out.print(" 领带");
        super.show();
    }
}
