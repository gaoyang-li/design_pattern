package builder_pattern.bad;

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

    public Student(int id, int age, int grade, String name, String college, String profession, List<String> awards) {
        this.id = id;
        this.age = age;
        this.grade = grade;
        this.name = name;
        this.college = college;
        this.profession = profession;
        this.awards = awards;
    }

    public static void main(String[] args) {
        Student student = new Student(1, 18, 3, "小明", "计算机学院", "计算机科学与技术",
                Arrays.asList("Java八股金牌", "Python八股金牌"));
    }
}