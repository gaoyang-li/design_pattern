package strategy_pattern.good;

import strategy_pattern.bad.bad2.CashDiscount;
import strategy_pattern.bad.bad2.CashNormal;
import strategy_pattern.bad.bad2.CashReturn;
import strategy_pattern.bad.bad2.CashSuper;

public class CashContext {
    private CashSuper cs; // 声明1个CashContext对象

    // 通过构造方法, 传入具体的收费策略
    public CashContext(int cashType) {
        switch (cashType) {
            case 1:
                this.cs = new CashNormal();
                break;
            case 2:
                this.cs = new CashDiscount(0.8);
                break;
            case 3:
                this.cs = new CashDiscount(0.7);
                break;
            case 4:
                this.cs = new CashReturn(300d, 100d);
                break;
        }
    }

    public double getResult(double price, int num) {
        // 根据收费策略的不同, 获得计算结果
        return this.cs.acceptCash(price, num);
    }

}
