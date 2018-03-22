package mzr.aop.cglib;

import mzr.aop.Hello;
import net.sf.cglib.proxy.Enhancer;

/**
 * Created by maozongren.
 * Time 2018/3/22 下午5:11
 */
public class Test {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Hello.class);    // 继承被代理类
        enhancer.setCallback(new HelloMethodInterceptor()); // 设置回调
        Hello hello = (Hello) enhancer.create();    // 生成代理类对象
        hello.sayHello("cglib");    // 会被实现类拦截
    }
}
