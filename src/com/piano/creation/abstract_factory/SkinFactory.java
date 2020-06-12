package com.piano.creation.abstract_factory;

/**
 * 界面皮肤工厂接口，充当抽象工厂（生产的产品组成一个产品族）
 */
public interface SkinFactory {
    Button createButton();
    TextField createTextField();
    ComboBox createComboBox();
}
