package template_method_pattern.bad1;

public class Main {
    /**
     * 客户端
     */
    public static void main(String[] args) {
        System.out.println("学生A的试卷");
        PaperA studentA = new PaperA();
        studentA.testQuestion1();
        studentA.testQuestion2();
        studentA.testQuestion3();

        System.out.println("学生B的试卷");
        PaperB studentB = new PaperB();
        studentB.testQuestion1();
        studentB.testQuestion2();
        studentB.testQuestion3();
    }
}
