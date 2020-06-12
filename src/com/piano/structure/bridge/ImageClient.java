package com.piano.structure.bridge;

/**
 * 桥接模式测试客户端
 */
public class ImageClient {
    public static void main(String[] args) {
        //操作系统类
        OSImg osImg = new WindowsImg();
        //图像类
        Image image = new JPGImage();
        image.setOsImg(osImg);

        image.parseFile("smile");
        //打印： 在 Windows 操作系统中显示图像：smile，格式为 JPG.
    }
}
