package chain_of_responsibility_pattern.hard;

import chain_of_responsibility_pattern.hard.handlers.Handler;

import java.util.ArrayList;
import java.util.List;

/**
 * 有了不同的Handler后, 把这些Handler组合起来, 变成一个链, 并通过一个统一入口处理
 */
public class HandlerChain {
    // 持有所有Handler
    private List<Handler> handlers = new ArrayList<>();

    public void addHandler(Handler handler) {
        handlers.add(handler);
    }

    public Boolean process(Request request) {
        // 依次调用每个Handler
        for (Handler handler : handlers) {
            Boolean result = handler.process(request);
            if (result != null) {
                // 如果返回TRUE或FALSE，处理结束
                System.out.println("请求被处理, 结果: " + result);
                return result;
            }
        }
        throw new RuntimeException("没有人能处理这请求");
    }
}
