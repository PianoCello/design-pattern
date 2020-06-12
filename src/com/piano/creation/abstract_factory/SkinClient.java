package com.piano.creation.abstract_factory;

/**
 * 皮肤客户端测试类
 */
public class SkinClient {
    public static void main(String[] args) {
        SkinFactory skinFactory = (SkinFactory) AbstractFactoryXmlUtil.getBean();
        if (skinFactory != null) {
            Button button = skinFactory.createButton();
            TextField textField = skinFactory.createTextField();
            ComboBox comboBox = skinFactory.createComboBox();

            button.display();
            textField.display();
            comboBox.display();
        }
    }
}
