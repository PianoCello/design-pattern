package com.piano.creation.prototype;

/**
 * 原型模式测试客户端
 */
public class WeeklyLogClient {
    public static void main(String[] args) throws Exception{
        //创建附件对象
        Attachment attachment = new Attachment();
        //创建原型对象
        WeeklyLog weeklyLog = new WeeklyLog();
        weeklyLog.setAttachment(attachment);
        //浅克隆的新对象
        WeeklyLog cloneWeeklyLog = weeklyLog.clone();

        System.out.println("浅克隆周报是否相同："+(weeklyLog==cloneWeeklyLog));
        System.out.println("浅克隆附件是否相同："+(weeklyLog.getAttachment()==cloneWeeklyLog.getAttachment()));

        //深克隆的新对象
        WeeklyLog deepClone = weeklyLog.deepClone();
        System.out.println("深克隆周报是否相同："+(weeklyLog==deepClone));
        System.out.println("深克隆附件是否相同："+(weeklyLog.getAttachment()==deepClone.getAttachment()));
    }
}
