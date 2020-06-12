package com.piano.structure.proxy;

/**
 * 具体查询类，充当真是主题角色，它实现查询功能
 */
public class RealSearcher implements Searcher {
    @Override
    public String doSearch(String userId, String keyword) {
        System.out.println("用户'"+userId+"'使用关键字'"+keyword+"'查询商务信息！");
        return "返回查询信息";
    }
}
