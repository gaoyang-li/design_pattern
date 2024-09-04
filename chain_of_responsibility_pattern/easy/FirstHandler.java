package chain_of_responsibility_pattern.easy;

public class FirstHandler extends Handler {
    @Override
    public void doHandle() {
        System.out.println("第一个");
    }
}
