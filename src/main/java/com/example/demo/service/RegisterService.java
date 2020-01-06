package com.example.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.pojo.Device;

import java.util.List;

/**
 * Created by YOGA on 2019/12/26.
 */
public interface RegisterService {
    List<Device> list();

    JSONObject add(Device device);
}
