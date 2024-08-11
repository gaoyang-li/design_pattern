package simple_factory_pattern.bad.bad1;

import java.util.Scanner;

// 计算器实现
public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number A: ");
            double A = Double.parseDouble(sc.nextLine());
            System.out.println("Enter the operator: +  -  *  / ");
            String operator = sc.nextLine();
            System.out.println("Enter the number B: ");
            double B = Double.parseDouble(sc.nextLine());
            double result = 0d;

            switch (operator) {
                case "+":
                    result = A + B;
                    break;
                case "-":
                    result = A - B;
                    break;
                case "*":
                    result = A * B;
                    break;
                case "/":
                    result = A / B;
                    break;
            }

            System.out.println("Result is: " + result);
        } catch (Exception e){
            System.err.println("Invalid input: " + e);
        }
    }
}
