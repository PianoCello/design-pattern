package com.piano.structure.facade;

/**
 * 加密外观类，充当外观类
 */
public class EncryptFacade {

    //维持对子系统的引用
    private FileReader fileReader;
    private CipherMachine cipherMachine;
    private FileWriter fileWriter;

    public EncryptFacade() {
        fileReader = new FileReader();
        cipherMachine = new CipherMachine();
        fileWriter = new FileWriter();
    }

    //调用子系统对象的业务方法
    public void fileEncrypt(String fileNameSrc,String fileNameDes) {
        //读取明文
        String plainText = fileReader.read(fileNameSrc);
        //加密后的密文
        String encryptStr = cipherMachine.encrypt(plainText);
        //保存文件
        fileWriter.write(encryptStr, fileNameDes);
    }
}
