package simple_factory_pattern.good;

import java.util.Scanner;

// 客户端
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number A: ");
        double numberA = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the operator: +  -  *  / ");
        String operator = sc.nextLine();
        System.out.println("Enter the number B: ");
        double numberB = Double.parseDouble(sc.nextLine());
        Operation operation = OperationFactory.createOpeation(operator);
        double result = operation.getResult(numberA, numberB);
        System.out.println("Result is: " + result);
    }
}
