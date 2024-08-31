package decorator_pattern.good1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("羔羊");
        System.out.println("第一种装扮:");
        Coat coat = new Coat();
        coat.decorate(person);
        Shirt shirt = new Shirt();
        shirt.decorate(coat);
        shirt.show();

        System.out.println("第二种装扮:");
        Sweater sweater = new Sweater();
        sweater.decorate(person);
        Tie tie = new Tie();
        tie.decorate(sweater);
        tie.show();
    }
}
