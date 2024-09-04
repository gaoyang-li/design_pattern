package chain_of_responsibility_pattern.hard.handlers;

import chain_of_responsibility_pattern.hard.Request;

/**
 * 上上上司
 */
public class CeoHandler implements Handler {
    @Override
    public Boolean process(Request request) {
        // 如果超过3000元, 处理不了, 没下一个了, 直接拒绝
        if (request.getAmount() > 1000) {
            return false;
        }
        return true;
    }
}
