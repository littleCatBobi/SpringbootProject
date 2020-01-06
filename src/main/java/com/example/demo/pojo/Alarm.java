package com.example.demo.pojo;

/**
 * Created by YOGA on 2019/12/26.
 */
public class Alarm {
    private String deviceID;
    private String token;
    private String algID;
    private String timestamp;
    private String image;
    private String msg;
    private String objCount;
    private String objList;
    private String appendix;

    public Alarm(){}
    public Alarm(String deviceID, String token, String algID,
                 String timestamp, String image, String msg, String objCount,
                 String objList, String appendix) {
        this.deviceID = deviceID;
        this.token = token;
        this.algID = algID;
        this.timestamp = timestamp;
        this.image = image;
        this.msg = msg;
        this.objCount = objCount;
        this.objList = objList;
        this.appendix = appendix;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAlgID() {
        return algID;
    }

    public void setAlgID(String algID) {
        this.algID = algID;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getObjCount() {
        return objCount;
    }

    public void setObjCount(String objCount) {
        this.objCount = objCount;
    }

    public String getObjList() {
        return objList;
    }

    public void setObjList(String objList) {
        this.objList = objList;
    }

    public String getAppendix() {
        return appendix;
    }

    public void setAppendix(String appendix) {
        this.appendix = appendix;
    }
}
