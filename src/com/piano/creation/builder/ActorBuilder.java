package com.piano.creation.builder;

/**
 * 游戏角色构造者，充当抽象构造者
 */
public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    abstract void buildType();
    abstract void buildSex();
    abstract void buildFace();
    abstract void buildCostume();
    abstract void buildHairstyle();

    //钩子方法
    public boolean isBareheaded() {
        return false;
    }

    //工厂方法，返回一个完整的游戏角色对象
    public Actor createActor() {
        return this.actor;
    }

/*    protected static Actor actor = new Actor();

    public static Actor construct(ActorBuilder actorBuilder) {
        actorBuilder.buildType();
        actorBuilder.buildSex();
        actorBuilder.buildFace();
        actorBuilder.buildCostume();
        actorBuilder.buildHairstyle();
        return actor;
    }*/
}
