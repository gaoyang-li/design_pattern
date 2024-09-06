package proxy_pattern.good2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        SubjectImpl subject = new SubjectImpl();            // 被代理
        InvocationHandler handler = new TestProxy(subject);
        Subject proxy = (Subject) Proxy.newProxyInstance(
                subject.getClass().getClassLoader(),        // 传入被代理的类的类加载器
                subject.getClass().getInterfaces(),         // 传入被代理的类的接口列表
                handler                                     // 传入实现的代理处理逻辑实现类
        );
        proxy.test();   // 如果现在调用代理类的test方法, 就会进入到上面TestProxy中invoke方法, 走代理逻辑
    }
}
