package prototype.prototype1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student("羔羊");
        Student student2 = (Student) student1.clone();
        System.out.println(student1 == student2);                       // false
        System.out.println(student1.getName() == student2.getName());   // true
    }
}
