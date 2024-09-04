package chain_of_responsibility_pattern.hard.handlers;

import chain_of_responsibility_pattern.hard.Request;

/**
 * 上上司
 */
public class ManagerHandler implements Handler {
    @Override
    public Boolean process(Request request) {
        // 如果超过2000元, 处理不了, 交下一个处理
        if (request.getAmount() > 2000) {
            return null;
        }
        // 如果是中明的请求, 则不通过
        if ("中明".equals(request.getName())) {
            return false;
        }
        return true;
    }
}
