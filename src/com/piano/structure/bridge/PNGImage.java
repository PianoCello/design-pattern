package com.piano.structure.bridge;

/**
 * PNG 格式图像，充当扩充抽象类
 */
public class PNGImage extends Image {
    @Override
    public void parseFile(String fileName) {
        //模拟解析 PNG 文件并获得一个像素矩阵对象 matrix
        Matrix matrix = new Matrix();
        osImg.doPaint(matrix);
        System.out.println(fileName+"，格式为 PNG. ");
    }
}
