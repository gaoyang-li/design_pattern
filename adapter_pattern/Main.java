package adapter_pattern;

// 目标接口
interface Voltage5V {
    int output5V();
}

// 源接口
class Voltage220V {
    public int output220V() {
        return 220;
    }
}

// 适配器类
class VoltageAdapter extends Voltage220V implements Voltage5V {
    public int output5V() {
        int src = output220V();
        System.out.println("原始电压：" + src + "V");
        int dst = src / 44; // 将220V电压转换成5V电压
        System.out.println("转换后电压：" + dst + "V");
        return dst;
    }
}

// 客户端代码
public class Main {
    public static void main(String[] args) {
        Voltage5V adapter = new VoltageAdapter();
        int output5V = adapter.output5V();
        System.out.println("输出电压：" + output5V + "V");
    }
}