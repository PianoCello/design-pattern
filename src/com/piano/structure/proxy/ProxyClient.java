package com.piano.structure.proxy;

/**
 * 代理模式测试客户端
 */
public class ProxyClient {

    public static  void main(String[] args) {
        Searcher searcher = new ProxySearcher();
        String search = searcher.doSearch("杨过", "小龙女");
        /*
        在数据库中验证用户’杨过'是否为合法用户？
        '杨过'登录成功！
        用户'杨过'使用关键字小龙女'查询商务信息！
        更新数据库，用户'杨过'查询次数+1
        */
    }
}
