package chain_of_responsibility_pattern.easy;

public class ThirdHandler extends Handler {
    @Override
    public void doHandle() {
        System.out.println("第三个");
    }
}
