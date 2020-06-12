package com.piano.structure.composite;

/**
 * 抽象文件类，充当抽象构件类
 */
public abstract class AbstractFile {
    abstract void add(AbstractFile file);
    abstract void remove(AbstractFile file);
    abstract AbstractFile getChild(int i);
    abstract void killVirus();
}
