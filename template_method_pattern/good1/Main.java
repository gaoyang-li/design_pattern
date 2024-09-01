package template_method_pattern.good1;

/**
 * 客户端
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("学生A的试卷");
        Paper studentA = new PaperA();
        studentA.testQuestion1();
        studentA.testQuestion2();
        studentA.testQuestion3();

        System.out.println("学生B的试卷");
        Paper studentB = new PaperB();
        studentB.testQuestion1();
        studentB.testQuestion2();
        studentB.testQuestion3();
    }
}
