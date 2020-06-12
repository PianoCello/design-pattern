package com.piano.creation.prototype;

import java.io.*;

/**
 * 工作周报类，充当原型角色
 */
public class WeeklyLog implements Serializable, Cloneable {
    private String name; //周报名称
    private String date; //提交日期
    private String content; //内容
    private Attachment attachment; //附件

    //深克隆方法
    public WeeklyLog deepClone() throws IOException, ClassNotFoundException {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(this);

        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(outputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(arrayInputStream);
        Object object = objectInputStream.readObject();

        return (WeeklyLog) object;
    }
    //浅克隆方法
    @Override
    public WeeklyLog clone() {
        WeeklyLog weeklyLog = null;
        try {
            weeklyLog = (WeeklyLog) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return weeklyLog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }
}
