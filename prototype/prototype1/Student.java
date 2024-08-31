package prototype.prototype1;

public class Student implements Cloneable {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // 只拷贝了Student对象; 没有拷贝其内层对象
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
