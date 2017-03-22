package mzr.pattern.strategy;

/**
 * Created by mzr on 17-3-16.
 */
public class User implements Strategy {
    public void reason() {
        System.out.println("客户不需要用这个");
    }
}