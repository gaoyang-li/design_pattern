package strategy_pattern.bad.bad3;

// 打折收费
public class CashDiscount extends CashSuper {
    private double discount;

    // 初始化时必须输入折扣率
    public CashDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double acceptCash(double price, int num) {
        return price * num * this.discount;
    }
}
