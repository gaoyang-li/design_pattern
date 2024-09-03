package composite_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 目录包含多个文件或目录
 */
public class Directory extends Component {
    // 存放目录中的子组件
    List<Component> children = new ArrayList<>();

    @Override
    public void addComponent(Component component) {
        children.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        children.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return children.get(index);
    }

    @Override
    public void doService() {
        // 继续调用所有子组件的test方法执行业务
        children.forEach(Component::doService);
    }
}
