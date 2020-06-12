package com.piano.structure.facade;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件保存类，充当子系统
 */
public class FileWriter {
    public void write(String encryptStr, String fileNameDes) {
        System.out.println("保存密文，写入文件。");

        // try with resource 自动关闭流的语法
        try (FileOutputStream outputStream = new FileOutputStream(fileNameDes)) {

            outputStream.write(encryptStr.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        } catch (IOException e) {
            System.out.println("保存文件出错！");
        }
    }
}
