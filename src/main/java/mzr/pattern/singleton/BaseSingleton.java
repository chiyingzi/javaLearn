package mzr.pattern.singleton;

/**
 * Created by mzr on 17-3-13.
 * 最基础的单例，只能单线程
 */
public class BaseSingleton {
    private static BaseSingleton instance = null;

    private BaseSingleton() {

    }

    public static BaseSingleton getInstance() {
        if (instance == null) {
            instance = new BaseSingleton();
        }
        return instance;
    }
}