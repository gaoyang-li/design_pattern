package chain_of_responsibility_pattern;

public class FirstHandler extends Handler {
    @Override
    public void doHandle() {
        System.out.println("第一个");
    }
}
