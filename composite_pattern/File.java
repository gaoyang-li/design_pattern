package composite_pattern;

public class File extends Component {

    @Override
    public void addComponent(Component component) {
        throw new UnsupportedOperationException();   // 不支持操作
    }

    @Override
    public void removeComponent(Component component) {
        throw new UnsupportedOperationException();   // 不支持操作
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void doService() {
        System.out.println("文件名称修改成功！" + this);   // 具体的名称修改操作
    }
}
