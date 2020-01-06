package com.example.demo.pojo;

/**
 * Created by YOGA on 2019/12/31.
 */
public class Token {
    private String deviceID;
    private String token;

    public Token(){}

    public Token(String deviceID, String token) {
        this.deviceID = deviceID;
        this.token = token;
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
}
