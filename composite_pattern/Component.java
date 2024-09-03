package composite_pattern;

/**
 * 创建一个抽象组件，组件可以包含组件，组件有自己的业务方法
 */
public abstract class Component {
    // 添加子组件
    public abstract void addComponent(Component component);

    // 删除子组件
    public abstract void removeComponent(Component component);

    // 获取子组件
    public abstract Component getChild(int index);

    // 执行业务方法, 比如修改文件名称
    public abstract void doService();

}
