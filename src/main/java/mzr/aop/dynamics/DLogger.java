package mzr.aop.dynamics;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * Created by mzr on 17-3-9.
 */
public class DLogger implements ILogger{
    public void start(Method method) {
        System.out.println(new Date()+ method.getName() + " say hello start...");
    }
    public void end(Method method) {
        System.out.println(new Date()+ method.getName() + " say hello end");
    }
}
