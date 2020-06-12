package com.piano.structure.bridge;

/**
 * Windows 操作系统，充当具体实现类
 */
public class WindowsImg implements OSImg {
    @Override
    public void doPaint(Matrix matrix) {
        //调用 Windows 系统的绘制函数绘制像素矩阵
        System.out.print("在 Windows 操作系统中显示图像：");
    }
}
