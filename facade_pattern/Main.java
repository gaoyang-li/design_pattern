package facade_pattern;

/**
 * 客户端
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doAll();
    }
}
