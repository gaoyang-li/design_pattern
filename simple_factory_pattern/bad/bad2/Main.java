package simple_factory_pattern.bad.bad2;

import java.util.Scanner;

// 客户端代码
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number A: ");
        double A = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the operator: +  -  *  / ");
        String operator = sc.nextLine();
        System.out.println("Enter the number B: ");
        double B = Double.parseDouble(sc.nextLine());
        double result = Operation.getResult(A, B, operator);
        System.out.println("Result is: " + result);
    }
}
