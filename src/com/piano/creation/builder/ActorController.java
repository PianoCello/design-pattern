package com.piano.creation.builder;

/**
 * 角色控制器，充当指挥者
 */
public class ActorController {
    //逐步构建复杂产品对象
    public Actor construct(ActorBuilder actorBuilder) {
        Actor actor = null;

        actorBuilder.buildType();
        actorBuilder.buildSex();
        actorBuilder.buildFace();
        actorBuilder.buildCostume();
        //通过钩子方法来控制产品的构建
        if (!actorBuilder.isBareheaded()) {
            actorBuilder.buildHairstyle();
        }
        actor = actorBuilder.createActor();
        return actor;
    }
}
