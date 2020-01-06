package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.pojo.Alarm;
import com.example.demo.service.AlarmService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by YOGA on 2019/12/26.
 */
@RestController
public class AlarmController {
    @Autowired
    AlarmService alarmService;

    @ApiOperation(value = "查看报警信息", notes = "查看所有算法报警信息")
    @GetMapping("/listAlarm")
    public List<Alarm> list() {
        return alarmService.list();
    }

    @ApiOperation(value = "上传算法报警结果", notes = "上传算法报警结果")
    @PostMapping("/alarm")
    public JSONObject alarm(@RequestBody Alarm alarm) {
        return alarmService.add(alarm);
    }
}
