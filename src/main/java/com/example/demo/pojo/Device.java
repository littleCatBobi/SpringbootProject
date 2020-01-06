package com.example.demo.pojo;

/**
 * Created by YOGA on 2019/12/28.
 */
public class Device {
    private String deviceID;
    private String p2pID;

    public Device(){}

    public Device(String deviceID, String p2pID) {
        this.deviceID = deviceID;
        this.p2pID = p2pID;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getP2pID() {
        return p2pID;
    }

    public void setP2pID(String p2pID) {
        this.p2pID = p2pID;
    }
}
