package com.piano.structure.bridge;

/**
 * 抽象操作系统，充当实现类接口
 */
public interface OSImg {
    //显示像素矩阵 matrix
    void doPaint(Matrix matrix);
}
