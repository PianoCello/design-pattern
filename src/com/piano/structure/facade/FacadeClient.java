package com.piano.structure.facade;

/**
 * 外观模式测试客户端
 */
public class FacadeClient {
    public static void main(String[] args) {
        EncryptFacade encryptFacade = new EncryptFacade();
        String src = "src\\com\\piano\\structure\\facade\\test.txt";
        String des = "src\\com\\piano\\structure\\facade\\test2.txt";

        encryptFacade.fileEncrypt(src, des);
    }
}
