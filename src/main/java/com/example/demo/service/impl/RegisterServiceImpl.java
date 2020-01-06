package com.example.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dao.RegisterMapper;
import com.example.demo.dao.TokenMapper;
import com.example.demo.pojo.Device;
import com.example.demo.pojo.Token;
import com.example.demo.service.RegisterService;
import com.example.demo.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by YOGA on 2019/12/28.
 */
@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    RegisterMapper registerMapper;

    @Autowired
    TokenMapper tokenMapper;

    Map<String, String> dev_and_tokens = new HashMap<>();

    @Override
    public List<Device> list() {
        return registerMapper.list();
    }

    @Transactional
    @Override
    public JSONObject add(Device device) {
        JSONObject jsonObject =  new JSONObject();
        jsonObject.put("err",0);
        jsonObject.put("errMsg","OK");
        //检查是否已注册
        boolean isRegistered = checkIsRegistered(device);
        if (isRegistered) {
            jsonObject.put("token", dev_and_tokens.get(device.getDeviceID()));
            return jsonObject;
        }

        registerMapper.add(device);
        //生成cookie
        String token = UUIDUtil.uuid();
        jsonObject.put("token",token);
        dev_and_tokens.put(device.getDeviceID(), token);
        addToken(device.getDeviceID(), token);
        return jsonObject;
    }

    /**保存设备的token
     * @param deviceID
     * @param token
     */
    private void addToken(String deviceID, String token) {
        Token tokenPojo = new Token();
        tokenPojo.setDeviceID(deviceID);
        tokenPojo.setToken(token);
        tokenMapper.add(tokenPojo);
    }

    private boolean checkIsRegistered(Device device) {
        String deviceID = device.getDeviceID();
        if (dev_and_tokens.get(deviceID) != null){
            return  true;
        }else {
            Token token = tokenMapper.selectByID(deviceID);
            if (token != null && token.getToken() != null){
                dev_and_tokens.put(deviceID, token.getToken());
                return true;
            }
        }
        return false;
    }
}
