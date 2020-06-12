package com.piano.structure.proxy.dynamic_proxy;

/**
 * 抽象用户 DAO 类，充当抽象主题角色
 */
public interface AbstractUserDAO {
    Boolean findUserById(String userId);
}
