package mzr.pattern.strategy;

/**
 * Created by mzr on 17-3-16.
 */
public class Refuse {
    private Strategy strategy;

    //构造函数，要用哪个策略
    public Refuse(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void reason() {
        this.strategy.reason();
    }
}
