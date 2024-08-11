package prototype.prototype2;

public class Student implements Cloneable {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {    // 针对成员变量也进行拷贝
        Student student = (Student) super.clone();
        student.name = new String(this.name);
        return student; // 成员拷贝完成后再返回
    }
}
