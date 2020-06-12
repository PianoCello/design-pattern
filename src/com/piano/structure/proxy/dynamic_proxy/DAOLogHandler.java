package com.piano.structure.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.time.LocalDateTime;

/**
 * 自定义请求处理程序类
 */
public class DAOLogHandler implements InvocationHandler {

    private Object object;

    //注入一个需要提供代理的真实主题对象
    public DAOLogHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用之前增强
        beforeInvoke();

        Object result = method.invoke(this.object, args);

        //调用之后增强
        afterInvoke();
        return result;
    }

    private void beforeInvoke() {
        System.out.println("调用时间：" + LocalDateTime.now());
    }

    private void afterInvoke() {
        System.out.println("方法调用结束！");
    }
}
