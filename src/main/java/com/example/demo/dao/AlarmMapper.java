package com.example.demo.dao;

import com.example.demo.pojo.Alarm;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by YOGA on 2019/12/26.
 */
public interface AlarmMapper {
    List<Alarm> list();
    Alarm selectByID(@Param("deviceID") String deviceID);
    void add(Alarm alarm);
    void update(Alarm alarm);
}
