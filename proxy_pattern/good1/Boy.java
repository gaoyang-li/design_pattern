package proxy_pattern.good1;

/**
 * 追求者类
 */
public class Boy implements GiveGift{
    private Girl girl;
    public Boy(Girl girl){
        this.girl = girl;
    }
    @Override
    public void givePen() {
        System.out.println(this.girl.getName() + ",你好.送你钢笔");
    }

    @Override
    public void giveGlass() {
        System.out.println(this.girl.getName() + ",你好.送你眼镜");
    }
}
