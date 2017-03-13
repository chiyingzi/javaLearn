package mzr.pattern.singleton;

/**
 * Created by mzr on 17-3-13.
 * 懒汉式，多线程可用但synchronized耗时
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {

    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
