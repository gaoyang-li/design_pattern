package simple_factory_pattern.good;

// 简单工厂类
public class OperationFactory {
    public static Operation createOpeation(String op){
        Operation operation = null;
        switch (op){
            case "+":
                return new Addition();
            case "-":
                return new Subtraction();
            case "*":
                return new Multiply();
            case "/":
                return new Division();
        }
        return operation;
    }
}
