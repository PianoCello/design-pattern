package com.piano.structure.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理测试客户端
 */
public class DynamicProxyClient {

    public static void main(String[] args) {
        //创建真实主题类
        AbstractUserDAO userDAO = new UserDAO();
        //创建请求处理程序类
        InvocationHandler handler = new DAOLogHandler(userDAO);

        AbstractUserDAO proxy = (AbstractUserDAO)Proxy.newProxyInstance(
                AbstractUserDAO.class.getClassLoader(),
                new Class[]{AbstractUserDAO.class},
                handler);

        proxy.findUserById("张无忌1");
    }
}
