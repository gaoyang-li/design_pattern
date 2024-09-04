package chain_of_responsibility_pattern.hard;

import chain_of_responsibility_pattern.hard.handlers.CeoHandler;
import chain_of_responsibility_pattern.hard.handlers.LeaderHandler;
import chain_of_responsibility_pattern.hard.handlers.ManagerHandler;

/**
 * 客户端
 */
public class Main {
    public static void main(String[] args) {
        // 构造责任链
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new LeaderHandler());
        chain.addHandler(new ManagerHandler());
        chain.addHandler(new CeoHandler());

        // 处理请求
        chain.process(new Request("小方", 5000.00));
    }
}
