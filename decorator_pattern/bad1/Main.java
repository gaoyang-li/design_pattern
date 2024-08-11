package decorator_pattern.bad1;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("羔羊");
        System.out.println("第一种装扮:");
        p.wearShirt();
        p.wearCoat();
        System.out.println("第二种装扮:");
        p.wearWeather();
        p.wearTie();
    }
}
