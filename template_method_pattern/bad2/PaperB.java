package template_method_pattern.bad2;

/**
 * 学生B 抄的试卷
 */
public class PaperB extends Paper {
    // 题目2
    @Override
    public void testQuestion1() {
        super.testQuestion1();
        System.out.println("学生B的答案1");
    }

    // 题目2
    @Override
    public void testQuestion2() {
        super.testQuestion2();
        System.out.println("学生B的答案2");
    }

    // 题目3
    @Override
    public void testQuestion3() {
        super.testQuestion3();
        System.out.println("学生B的答案3");
    }
}
