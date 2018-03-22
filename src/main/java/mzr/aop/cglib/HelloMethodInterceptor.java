package mzr.aop.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by maozongren.
 * Time 2018/3/22 下午5:07
 */
public class HelloMethodInterceptor implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("[] say hello start..." + method.getName());
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println(" say hello end" + method.getName());
        return object;
    }
}
