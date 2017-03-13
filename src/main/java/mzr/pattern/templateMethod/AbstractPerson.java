package mzr.pattern.templateMethod;

/**
 * Created by mzr on 17-3-13.
 */
public abstract class AbstractPerson {
    //抽象类定义整个流程骨架
    public void workProject() {
        plan();
        develop();
        test();
    }

    //以下是不同子类根据自身特性完成的具体步骤
    protected abstract void plan();

    protected abstract void develop();

    protected abstract void test();
}
