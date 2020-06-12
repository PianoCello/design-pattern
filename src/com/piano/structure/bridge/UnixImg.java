package com.piano.structure.bridge;

/**
 * Unix 操作系统，充当具体实现类
 */
public class UnixImg implements OSImg {
    @Override
    public void doPaint(Matrix matrix) {
        //调用 Unix 系统的绘制函数绘制像素矩阵
        System.out.print("在 Unix 操作系统中显示图像：");
    }
}
