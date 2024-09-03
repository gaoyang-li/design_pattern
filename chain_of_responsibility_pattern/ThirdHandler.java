package chain_of_responsibility_pattern;

public class ThirdHandler extends Handler {
    @Override
    public void doHandle() {
        System.out.println("第三个");
    }
}
