财务审批就是一个责任链模式。假设某个员工需要报销一笔费用，审核者可以分为：

    Manager：只能审核1000元以下的报销；
    Director：只能审核10000元以下的报销；
    CEO：可以审核任意额度。

1. 用责任链模式设计此报销流程时, 每个审核者只关心自己责任范围内的请求, 并且处理它
2. 对于超出自己责任范围的, 扔给下一个审核者处理
3. 将来继续添加审核者的时候, 不用改动现有逻辑 

# 步骤
1. 抽象出**请求对象**, 在责任链上传递
2. 抽象出**处理器**
3. 做好**约定**: 返回**true**表示处理成功; 返回**false**表示处理失败(请求被拒绝); 返回**null**表示交给下一个handler处理
4. 把所有的handler组合起来变成一个**链**, 通过统一入口处理
5. 在客户端组装**责任链**用来处理请求