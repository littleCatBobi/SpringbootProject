package com.example.demo.dao;

import com.example.demo.pojo.Token;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by YOGA on 2019/12/31.
 */
public interface TokenMapper {
    List<Token> list();
    Token selectByID(@Param("deviceID") String deviceID);
    void add(Token token);
}
