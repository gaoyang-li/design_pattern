package chain_of_responsibility_pattern;

public class SecondHandler extends Handler {
    @Override
    public void doHandle() {
        System.out.println("第二个");
    }
}
