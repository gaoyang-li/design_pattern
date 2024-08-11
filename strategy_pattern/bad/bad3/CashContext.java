package strategy_pattern.bad.bad3;

import strategy_pattern.bad.bad2.CashSuper;

public class CashContext {
    private CashSuper cs; // 声明1个CashContext对象

    // 通过构造方法, 传入具体的收费策略
    public CashContext(CashSuper cs) {
        this.cs = cs;
    }

    public double getResult(double price, int num) {
        // 根据收费策略的不同, 获得计算结果
        return this.cs.acceptCash(price, num);
    }

}
