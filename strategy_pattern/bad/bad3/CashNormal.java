package strategy_pattern.bad.bad3;

// 正常收费
public class CashNormal extends CashSuper {
    // 原价返回
    @Override
    public double acceptCash(double price, int num) {
        return price * num;
    }
}
