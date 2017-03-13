package mzr.aop.dynamics;

import java.lang.reflect.Method;

/**
 * Created by mzr on 17-3-9.
 */
public interface ILogger {
    void start(Method method);
    void end(Method method);
}
