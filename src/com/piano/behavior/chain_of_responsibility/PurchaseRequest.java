package com.piano.behavior.chain_of_responsibility;

/**
 * 采购单类，充当请求类
 */
public class PurchaseRequest {
    //采购金额
    private double amount;
    //采购目的
    private String purpose;
    //采购单编号
    private int number;

    public PurchaseRequest(double amount, int number, String purpose) {
        this.amount = amount;
        this.purpose = purpose;
        this.number = number;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
