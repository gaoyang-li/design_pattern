package proxy_pattern.good2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类，需要实现InvocationHandler接口
 */
public class TestProxy implements InvocationHandler {
    private final Object object;

    public TestProxy(Object object) {
        this.object = object;
    }

    /**
     * 调用代理对象的对应方法时会进入; 这里需要编写如何进行代理
     *
     * @param proxy:  代理对象
     * @param method: 调用的代理对象的哪一个方法
     * @param args:   实参数组
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 动态生成的代理对象, 找不到源代码
        System.out.println("生成的代理对象: " + proxy.getClass());

        // 在代理中调用被代理对象原本的方法. 因为是代理, 要执行一下别人的业务
        // 也可以不执行, 但是这样就失去代理的意义了, 注意要用上面的object
        Object res = method.invoke(object, args);

        System.out.println("方法调用完成, 返回值为: " + res);
        return res;
    }
}
