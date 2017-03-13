package mzr.pattern.singleton;

/**
 * Created by mzr on 17-3-13.
 * 饿汉式，多线程可用，但启动耗时，且提前创建可能降低内存使用率（如果后来没用的话）
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}