package decorator_pattern.good1;

// ConcreteComponent
// 具体人类
public class Person implements Character {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("装饰的" + this.name);
    }
}
