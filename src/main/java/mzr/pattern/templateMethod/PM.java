package mzr.pattern.templateMethod;

/**
 * Created by mzr on 17-3-13.
 */
public class PM extends AbstractPerson {
    @Override
    protected void plan() {
        System.out.println("定需求");
    }

    @Override
    protected void develop() {
        System.out.println("改需求");
    }

    @Override
    protected void test() {
        System.out.println("验收");
    }
}
