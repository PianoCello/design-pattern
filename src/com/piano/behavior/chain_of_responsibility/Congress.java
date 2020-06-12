package com.piano.behavior.chain_of_responsibility;

/**
 * 董事会，充当具体处理者
 */
public class Congress extends Approver {
    public Congress(String name) {
        super(name);
    }

    //具体请求处理方法
    public void processRequest(PurchaseRequest request) {
        System.out.println(this.name +
                "审批采购单：" + request.getNumber() +
                "，金额：" + request.getAmount() +
                "元，采购目的：" + request.getPurpose() + ". ");
    }
}