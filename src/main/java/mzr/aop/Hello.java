package mzr.aop;

/**
 * Created by mzr on 17-3-9.
 */
public class Hello implements IHello{
    public void sayHello(String str) {
        System.out.println("hello "+str);
    }
}