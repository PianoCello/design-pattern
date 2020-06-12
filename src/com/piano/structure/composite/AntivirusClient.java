package com.piano.structure.composite;

/**
 * 组合模式测试客户端
 */
public class AntivirusClient {
    public static void main(String[] args) {

        AbstractFile file, file1, file2, file3,
                folder, folder2, folder3;

        file = new TextFile("九阴真经.txt");
        file1 = new TextFile("葵花宝典.txt");
        file2 = new ImageFile("小龙女.JPG");
        file3 = new ImageFile("张无忌.JPG");

        folder = new Folder("我的电脑");
        folder2 = new Folder("文本文件");
        folder3 = new Folder("图片文件");

        folder2.add(file);
        folder2.add(file1);
        folder3.add(file2);
        folder3.add(file3);

        folder.add(folder2);
        folder.add(folder3);

        folder.killVirus();
    }
}
