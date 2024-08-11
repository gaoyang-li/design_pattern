package singleton.lazy3;

public class Singleton {
    private static volatile Singleton instance; // 保证instance在线程之间的可见性; 当其它线程进入后才会根据其它线程拿instance
    private Singleton(){}
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){          // 内测再进行一次检查; 双重检查锁定
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
