package proxy_pattern.bad2;

// 代理类
public class Proxy {
    private Girl girl;

    public Proxy(Girl girl) {
        this.girl = girl;
    }

    public void givePen() {
        System.out.println(this.girl.getName() + ",你好.送你钢笔");
    }

    public void giveGlass() {
        System.out.println(this.girl.getName() + ",你好.送你眼镜");
    }
}
