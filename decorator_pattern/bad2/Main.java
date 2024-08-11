package decorator_pattern.bad2;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("羔羊");
        System.out.println("第一种装扮:");
        Cloth shirt = new Shirt();
        Cloth coat = new Coat();
        shirt.show();
        coat.show();
        System.out.println("第二种装扮:");
        Cloth weather = new Sweater();
        Cloth tie = new Tie();
        weather.show();
        tie.show();
    }
}
