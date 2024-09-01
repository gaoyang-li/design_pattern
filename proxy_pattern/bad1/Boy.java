package proxy_pattern.bad1;

/**
 * 追求者类
 */
public class Boy {
    private Girl girl;

    public Boy(Girl girl) {
        this.girl = girl;
    }

    public void givePen() {
        System.out.println(this.girl.getName() + ",你好.送你钢笔");
    }

    public void giveGlass() {
        System.out.println(this.girl.getName() + ",你好.送你眼镜");
    }
}
