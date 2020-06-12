package com.piano.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹类，充当容器构件
 */
public class Folder extends AbstractFile {
    //定义集合 files，用于储存 AbstractFile 类型的成员
    private List<AbstractFile> files = new ArrayList<>();

    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    void add(AbstractFile file) {
        files.add(file);
    }

    @Override
    void remove(AbstractFile file) {
        files.remove(file);
    }

    @Override
    AbstractFile getChild(int i) {
        return files.get(i);
    }

    @Override
    void killVirus() {
        System.out.println(" --- 对文件夹 '"+name+"' 进行杀毒 ");
        for (AbstractFile file : files) {
            file.killVirus();
        }
    }
}
