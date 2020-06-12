package com.piano.creation.builder;

/**
 * 恶魔角色构造者，充当具体构造者
 */
public class DevilActorBuilder extends ActorBuilder {
    @Override
    void buildType() {
        actor.setType("恶魔");
    }
    @Override
    void buildSex() {
        actor.setSex("妖");
    }
    @Override
    void buildFace() {
        actor.setFace("丑陋");
    }
    @Override
    void buildCostume() {
        actor.setCostume("黑衣");
    }
    @Override
    void buildHairstyle() {
        actor.setHairstyle("光头");
    }
    //覆盖钩子方法
    @Override
    public boolean isBareheaded() {
        return true;
    }
}

