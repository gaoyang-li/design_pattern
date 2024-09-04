package chain_of_responsibility_pattern.hard.handlers;

import chain_of_responsibility_pattern.hard.Request;

/**
 * 处理器
 */
public interface Handler {
    // 返回 TRUE  = 成功
    // 返回 FALSE = 拒绝
    // 返回 null  = 交下一个处理
    Boolean process(Request request);
}
