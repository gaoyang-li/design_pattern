package composite_pattern;

public class Main {
    public static void main(String[] args) {
        Directory outer = new Directory();  // 新建1个外层目录
        Directory inner = new Directory();  // 新建1个内层目录
        outer.addComponent(inner);          // 在外层目录里面添加内层目录
        outer.addComponent(new File());     // 在外层目录里面添加文件
        inner.addComponent(new File());     // 在内层目录里面添加文件
        inner.addComponent(new File());     // 在内层目录里面添加文件
        outer.doService();  // 执行文件名称修改操作
    }
}
