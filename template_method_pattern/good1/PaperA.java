package template_method_pattern.good1;

/**
 * 学生A 的试卷
 * 因为父类有模板, 所以子类只需要重写抽象方法
 */
public class PaperA extends Paper {
    @Override
    protected String testAnswer1() {
        return "学生A的答案1";
    }

    @Override
    protected String testAnswer2() {
        return "学生A的答案2";
    }

    @Override
    protected String testAnswer3() {
        return "学生A的答案3";
    }
}
