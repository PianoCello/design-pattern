package com.piano.structure.bridge;

/**
 * 抽象图像类，充当抽象类
 */
public abstract class Image {
    //子类可以调用
    protected OSImg osImg;

    //注入 实现类接口 对象
    public void setOsImg(OSImg osImg) {
        this.osImg = osImg;
    }

    //解析图像并显示，由子类实现
    public abstract void parseFile(String fileName);
}
