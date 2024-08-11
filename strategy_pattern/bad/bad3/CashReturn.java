package strategy_pattern.bad.bad3;

public class CashReturn extends CashSuper {
    private double moneyCondition;
    private double moneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double price, int num) {
        double result = price * num;
        if (result >= this.moneyCondition) {
            result -= this.moneyReturn;
        }
        return result;
    }
}
