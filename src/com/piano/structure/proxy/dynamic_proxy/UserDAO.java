package com.piano.structure.proxy.dynamic_proxy;

/**
 * 用户 DAO 类，充当具体主题角色
 */
public class UserDAO implements AbstractUserDAO {
    @Override
    public Boolean findUserById(String userId) {
        if (userId.equalsIgnoreCase("张无忌")) {
            System.out.println("查询 ID 为'" + userId + "'的用户信息成功！");
            return true;
        } else {
            System.out.println("查询 ID 为'" + userId + "'的用户信息失败！");
            return null;
        }
    }
}
