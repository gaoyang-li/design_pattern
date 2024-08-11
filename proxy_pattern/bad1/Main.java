package proxy_pattern.bad1;

public class Main {
    public static void main(String[] args) {
        Girl girl = new Girl("小红");
        Boy boy = new Boy(girl);    // 问题是: 追求者与被追求者不认识
        boy.givePen();
        boy.giveGlass();
    }
}
