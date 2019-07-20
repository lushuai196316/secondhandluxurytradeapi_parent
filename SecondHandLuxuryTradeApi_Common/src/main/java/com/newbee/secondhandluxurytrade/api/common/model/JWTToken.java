package com.newbee.secondhandluxurytrade.api.common.model;

import lombok.Data;

@Data
public class JWTToken {

    private int id; //用户id
    private String phone; //手机号
    public String no;//jwt令牌的序号  唯一
    private int device;//设备类型
    private String deviceMac;//设备的mac（唯一地址）
}
