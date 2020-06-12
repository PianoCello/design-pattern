package com.piano.structure.proxy;

/**
 * 代理查询类，充当代理主题角色，它是查询代理
 * 维持了对 RealSearcher、AccessValidator 和 Logger 对象的引用
 */
public class ProxySearcher implements Searcher{
    //维持了对真实主题的引用
    private RealSearcher realSearcher = new RealSearcher();
    private AccessValidator accessValidator;
    private Logger logger;

    public String doSearch(String userId, String keyword) {

        //如果验证成功，则执行查询
        if (this.validate(userId)) {
            String result = realSearcher.doSearch(userId, keyword);
            this.log(userId);
            return result;
        }
        return null;
    }

    public boolean validate(String userId) {
        accessValidator = new AccessValidator();
        boolean validate = accessValidator.validate(userId);
        return validate;
    }

    public void log(String userId) {
        logger = new Logger();
        logger.log(userId);
    }
}
