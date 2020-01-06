package com.example.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.pojo.Alarm;

import java.util.List;

/**
 * Created by YOGA on 2019/12/26.
 */
public interface AlarmService {
    List<Alarm> list();
    JSONObject add(Alarm alarm);
}
