package strategy_pattern.bad.bad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double price = 0d;          // 商品单价
        int num = 0;                // 商品数量
        double totalPrice = 0d;     // 当前商品合计费用
        double total = 0d;          // 总计所有商品费用
        int discount = 0;           // 商品打折销售模式

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("输入商品销售模式: 1.原价 2.八折 3.七折");
            discount = Integer.parseInt(sc.nextLine());         // 商品打折销售模式
            System.out.println("输入商品单价: ");
            price = Double.parseDouble(sc.nextLine());          // 商品单价
            System.out.println("输入商品数量: ");
            num = Integer.parseInt(sc.nextLine());
            System.out.println();
            switch (discount) {
                case 1:
                    totalPrice = price * num;
                    break;
                case 2:
                    totalPrice = price * num * 0.8;
                    break;
                case 3:
                    totalPrice = price * num * 0.7;
                    break;
            }
            total += totalPrice;
            System.out.println();
            System.out.println("单价: " + price + ", " + "数量: " + num + ", " + "合计: " + totalPrice);
            System.out.println();
            System.out.println("总计: " + total);
            System.out.println();
        }
    }
}
