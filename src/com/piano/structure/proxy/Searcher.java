package com.piano.structure.proxy;

/**
 * 抽象查询类，充当抽象主题角色
 */
public interface Searcher {
    String doSearch(String userId, String keyword);
}
