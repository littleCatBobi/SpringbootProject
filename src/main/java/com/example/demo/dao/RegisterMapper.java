package com.example.demo.dao;

import com.example.demo.pojo.Device;

import java.util.List;

/**
 * Created by YOGA on 2019/12/26.
 */
public interface RegisterMapper {
    List<Device> list();

    void add(Device device);
}
