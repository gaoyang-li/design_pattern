package template_method_pattern.bad2;

/**
 * 学生A 抄的试卷
 */
public class PaperA extends Paper {
    // 题目1
    @Override
    public void testQuestion1() {
        super.testQuestion1();
        System.out.println("学生A的答案1");
    }

    // 题目2
    @Override
    public void testQuestion2() {
        super.testQuestion2();
        System.out.println("学生A的答案2");
    }

    // 题目3
    @Override
    public void testQuestion3() {
        super.testQuestion3();
        System.out.println("学生A的答案3");
    }
}
