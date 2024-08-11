package strategy_pattern.bad.bad3;

// 收费抽象类
public abstract class CashSuper {
    /*收取费用的抽象方法
        @param price: 单价
        @param num: 数量
     */
    public abstract double acceptCash(double price, int num);
}
