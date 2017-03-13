package mzr.pattern.templateMethod;

/**
 * Created by mzr on 17-3-13.
 */
public class RD extends AbstractPerson {
    @Override
    protected void plan() {
        System.out.println("估排期");
    }

    @Override
    protected void develop() {
        System.out.println("写代码");
    }

    @Override
    protected void test() {
        System.out.println("改bug");
    }
}
