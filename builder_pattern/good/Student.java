package builder_pattern.good;

import java.util.Arrays;
import java.util.List;

public class Student {
    int id;
    int age;
    int grade;
    String name;
    String college;
    String profession;
    List<String> awards;

    //一律使用建造者创建，不对外直接开放
    private Student(int id, int age, int grade, String name, String college, String profession, List<String> awards) {
        this.id = id;
        this.age = age;
        this.grade = grade;
        this.name = name;
        this.college = college;
        this.profession = profession;
        this.awards = awards;
    }

    public static StudentBuilder builder() {   //通过builder方法直接获取建造者
        return new StudentBuilder();
    }

    public static class StudentBuilder {   //这里就直接创建一个内部类
        //Builder也需要将所有的参数都进行暂时保存，所以Student怎么定义的这里就怎么定义
        int id;
        int age;
        int grade;
        String name;
        String college;
        String profession;
        List<String> awards;

        public StudentBuilder id(int id) {    //直接调用建造者对应的方法，为对应的属性赋值
            this.id = id;
            return this;   //为了支持链式调用，这里直接返回建造者本身，下同
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder grade(int grade) {
            this.grade = grade;
            return this;
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder college(String college) {
            this.college = college;
            return this;
        }

        public StudentBuilder profession(String profession) {
            this.profession = profession;
            return this;
        }

        public StudentBuilder awards(String... awards) {
            this.awards = Arrays.asList(awards);
            return this;
        }

        public Student build() {    //最后我们只需要调用建造者提供的build方法即可根据我们的配置返回一个对象
            return new Student(id, age, grade, name, college, profession, awards);
        }
    }
}