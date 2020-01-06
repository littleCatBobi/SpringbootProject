package com.example.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dao.AlarmMapper;
import com.example.demo.pojo.Alarm;
import com.example.demo.service.AlarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by YOGA on 2019/12/26.
 */
@Service
public class AlarmServiceImpl implements AlarmService{
    @Autowired
    AlarmMapper alarmMapper;

    @Override
    public List<Alarm> list() {
        return alarmMapper.list();
    }

    @Override
    public JSONObject add(Alarm alarm) {
        JSONObject jsonObject =  new JSONObject();
        Alarm alarmSelected = alarmMapper.selectByID(alarm.getDeviceID());
        if (alarmSelected != null && alarmSelected.getDeviceID() != null){
            alarmMapper.update(alarm);
        }else {
            alarmMapper.add(alarm);
        }

        jsonObject.put("err",0);
        jsonObject.put("errMsg","OK");
        return jsonObject;
    }
}
