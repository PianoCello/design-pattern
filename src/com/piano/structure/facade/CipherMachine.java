package com.piano.structure.facade;

/**
 * 数据加密类，充当子系统
 */
public class CipherMachine {
    //求模运算
    public String encrypt(String plainText) {
        System.out.print("数据加密，将明文转换为密文：");
        StringBuilder es = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            String s = String.valueOf(plainText.charAt(i) % 7);
            es.append(s);
        }
        System.out.println(es.toString());
        return es.toString();
    }
}
