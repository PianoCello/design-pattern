package com.piano.structure.adapter.default_adapter;

/**
 * 具体业务类
 */
public class ConcreteServiceClass extends AbstractServiceClass {

    @Override
    public void serviceMethod() {
        System.out.println(" 有选择覆盖 serviceMethod ");
    }
}
