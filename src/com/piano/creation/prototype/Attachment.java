package com.piano.creation.prototype;

import java.io.Serializable;

/**
 * 附件类
 */
public class Attachment implements Serializable {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
