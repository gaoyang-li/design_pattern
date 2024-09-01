package template_method_pattern.good1;

/**
 * 考卷
 */
public abstract class Paper {
    // 题目1
    public void testQuestion1() {
        System.out.println("问题1");
        System.out.println("答案1:" + testAnswer1());           // 调用抽象方法TestAnswer1
    }

    // 答案1
    protected abstract String testAnswer1();     // 给子类重写, 因为每个人的答案不同

    // 题目2
    public void testQuestion2() {
        System.out.println("问题2");
        System.out.println("答案2:" + testAnswer2());           // 调用抽象方法TestAnswer2
    }

    // 答案2
    protected abstract String testAnswer2();     // 给子类重写, 因为每个人的答案不同

    // 题目3
    public void testQuestion3() {
        System.out.println("问题3");
        System.out.println("答案3:" + testAnswer3());           // 调用抽象方法TestAnswer3
    }

    // 答案3
    protected abstract String testAnswer3();      // 给子类重写, 因为每个人的答案不同
}
