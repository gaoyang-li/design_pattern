package chain_of_responsibility_pattern;

public class Main {
    public static void main(String[] args) {
        // 先第一个
        Handler handler = new FirstHandler();

        // 再第二个和第三个
        handler.connect(new SecondHandler())
                .connect(new ThirdHandler());
    }
}
