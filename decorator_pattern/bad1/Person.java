package decorator_pattern.bad1;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void wearShirt() {
        System.out.println("衬衫");
    }

    public void wearCoat() {
        System.out.println("外套");
    }

    public void wearWeather() {
        System.out.println("毛衣");
    }

    public void wearTie() {
        System.out.println("领带");
    }
}
