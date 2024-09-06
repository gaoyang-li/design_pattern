package proxy_pattern.good1;

public class Main {
    public static void main(String[] args) {
        Girl girl = new Girl("小红");
        Proxy proxy = new Proxy(girl);
        proxy.givePen();
        proxy.giveGlass();
    }
}
