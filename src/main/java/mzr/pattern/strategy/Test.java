package mzr.pattern.strategy;

/**
 * Created by mzr on 17-3-16.
 */
public class Test {
    public static void main(String[] args) {
        Refuse refuse;

        // 拒绝需求三部曲
        refuse = new Refuse(new Technology());
        refuse.reason();

        refuse.setStrategy(new User());
        refuse.reason();

        refuse.setStrategy(new Time());
        refuse.reason();
    }
}
