package com.piano.creation.prototype;

/**
 * 原型管理器，这个类一般设置成单例类
 */
/*public class PrototypeManager {
    //使用 Hashtable 存储原型对象
    private Hashtable prototypeTable = new Hashtable();

    public PrototypeManager() {
        prototypeTable.put("A", new Attachment());
        prototypeTable.put("B", new WeeklyLog());
    }

    public void add(String key, Prototype prototype) {
        prototypeTable.put(key, prototype);
    }

    public Prototype get(String key) {
        Prototype prototype = null;
        prototype = ((Prototype) prototypeTable.get(key)).clone();
        return prototype;
    }
}*/
