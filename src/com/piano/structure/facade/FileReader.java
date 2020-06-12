package com.piano.structure.facade;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 文件读取类，充当子系统
 */
public class FileReader {
    public String read(String fileNameSrc) {
        System.out.print("读取文件，获取明文：");
        StringBuilder builder = new StringBuilder();
        try {
            FileInputStream inputStream = new FileInputStream(fileNameSrc);

            int data;
            // return -1 if the end of the file is reached.
            while ((data=inputStream.read()) != -1) {
                builder.append((char) data);
            }
            //读取完毕，关流
            inputStream.close();
            System.out.println(builder.toString());

        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        } catch (IOException e) {
            System.out.println("读取文件失败");
        }
        return builder.toString();
    }
}
