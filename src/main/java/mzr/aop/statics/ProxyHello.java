package mzr.aop.statics;

import mzr.aop.IHello;

/**
 * Created by mzr on 17-3-9.
 */
public class ProxyHello implements IHello {
    private IHello hello;
    public ProxyHello(IHello hello) {
        super();
        this.hello = hello;
    }
    public void sayHello(String str) {
        Logger.start();//添加特定的方法
        hello.sayHello(str);
        Logger.end();
    }
}
