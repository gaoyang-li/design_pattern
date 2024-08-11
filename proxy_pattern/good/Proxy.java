package proxy_pattern.good;

// 代理类
public class Proxy implements GiveGift{
    private Boy boy;    // 认识追求者
    public Proxy(Girl girl){        // 认识被追求者
        this.boy = new Boy(girl);   // 代理的初始化, 实际就是 追求者的初始化
    }
    @Override
    public void givePen(){          // 代理送礼物
        this.boy.givePen();         // 实际是 追求者送礼物
    }
    @Override
    public void giveGlass(){
        this.boy.giveGlass();
    }
}
