package com.piano.creation.builder;

/**
 * 天使角色构造者，充当具体构造者
 */
public class AngelActorBuilder extends ActorBuilder {
    @Override
    void buildType() {
        actor.setType("天使");
    }
    @Override
    void buildSex() {
        actor.setSex("女");
    }
    @Override
    void buildFace() {
        actor.setFace("漂亮");
    }
    @Override
    void buildCostume() {
        actor.setCostume("白裙");
    }
    @Override
    void buildHairstyle() {
        actor.setHairstyle("披肩长发");
    }
}
