package template_method_pattern.good1;

/**
 * 学生B 的试卷
 * 因为父类有模板, 所以子类只需要重写抽象方法
 */
public class PaperB extends Paper {
    @Override
    protected String testAnswer1() {
        return "学生B的答案1";
    }

    @Override
    protected String testAnswer2() {
        return "学生B的答案2";
    }

    @Override
    protected String testAnswer3() {
        return "学生B的答案3";
    }
}
