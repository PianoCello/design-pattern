package com.piano.creation.builder;

/**
 * 游戏角色客户端测试类
 */
public class ActorClient {
    public static void main(String[] args) {
        Actor actor = null;
        //反射生成具体构造者对象
        ActorBuilder actorBuilder = (ActorBuilder) BuilderXmlUtil.getBean();

        ActorController actorController = new ActorController();
        //通过指挥者创建完整的构造者对象
        actor = actorController.construct(actorBuilder);

        System.out.println(actor);
    }
}
