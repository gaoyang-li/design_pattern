package chain_of_responsibility_pattern.hard.handlers;

import chain_of_responsibility_pattern.hard.Request;

/**
 * 上司
 */
public class LeaderHandler implements Handler {
    @Override
    public Boolean process(Request request) {
        // 如果超过1000元, 处理不了, 交下一个处理
        if (request.getAmount() > 1000) {
            return null;
        }
        // 如果是小明的请求, 则不通过
        if ("小明".equals(request.getName())) {
            return false;
        }
        return true;
    }
}
