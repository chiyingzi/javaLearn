package mzr.pattern.strategy;

/**
 * Created by mzr on 17-3-16.
 */
public class Time implements Strategy {
    public void reason() {
        System.out.println("这个实现需要半年");
    }
}