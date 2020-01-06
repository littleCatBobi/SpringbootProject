package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.pojo.Device;
import com.example.demo.service.RegisterService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by YOGA on 2019/12/26.
 */
@RestController
public class RegisterController {
    @Autowired
    RegisterService registerService;

    @ApiOperation(value = "查看设备信息", notes = "注册的所有设备信息")
    @GetMapping("/listRegister")
    public List<Device> list() {
        return registerService.list();
    }

    @ApiOperation(value = "注册设备信息", notes = "注册设备信息")
    @PostMapping("/register")
    public JSONObject register(@RequestBody Device device) {
        return registerService.add(device);
    }
}
