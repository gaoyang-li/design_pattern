package strategy_pattern.bad.bad2;

// 收费工厂
public class CashFactory {
    public static CashSuper createCashAccept(int cashType){
        CashSuper cs = null;
        switch (cashType){
            case 1:                                                             // 原价
                cs = new CashNormal();
                break;
            case 2:                                                             // 八折
                cs = new CashDiscount(0.8);
                break;
            case 3:                                                             // 七折
                cs = new CashDiscount(0.7);
                break;
            case 4:                                                             // 满300送100
                cs = new CashReturn(300d, 100d);
                break;
        }
        return cs;
    }
}
