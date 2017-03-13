package mzr.pattern.singleton;

/**
 * Created by mzr on 17-3-13.
 * 内部静态类方式，可lazy加载，推荐使用
 */
public class StaticInnerSingleton {
    private StaticInnerSingleton() {

    }

    private static class SingletonHolder {
        private final static StaticInnerSingleton instance = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return SingletonHolder.instance;
    }
}