package chain_of_responsibility_pattern;

import java.util.Optional;

public abstract class Handler {
    // 单链表形式, 存放后继节点
    protected Handler successor;

    // 拼接后续节点
    public Handler connect(Handler successor) {
        this.successor = successor;
        return successor;   // 返回后继节点, 方便链式调用
    }

    public void handle() {
        // 由不同的子类实现具体处理过程
        this.doHandle();
        // 如果还有后继节点，就继续向下传递
        Optional.ofNullable(successor)
                .ifPresent(Handler::handle);
    }

    // 交给子类实现
    public abstract void doHandle();
}
