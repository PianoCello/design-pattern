package com.piano.creation.builder;

/**
 * 英雄角色构造者，充当具体构造者
 */
public class HeroActorBuilder extends ActorBuilder {
    @Override
    void buildType() {
        actor.setType("英雄");
    }
    @Override
    void buildSex() {
        actor.setSex("难");
    }
    @Override
    void buildFace() {
        actor.setFace("英俊");
    }
    @Override
    void buildCostume() {
        actor.setCostume("盔甲");
    }
    @Override
    void buildHairstyle() {
        actor.setHairstyle("飘逸");
    }
}
