package chain_of_responsibility_pattern.hard;

/**
 * 请求对象
 */
public class Request {
    private String name;
    private Double amount;

    public Request(String name, Double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public Double getAmount() {
        return amount;
    }
}
