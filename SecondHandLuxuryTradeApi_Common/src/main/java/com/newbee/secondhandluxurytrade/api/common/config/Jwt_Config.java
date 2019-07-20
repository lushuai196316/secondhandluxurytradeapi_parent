package com.newbee.secondhandluxurytrade.api.common.config;

public class Jwt_Config {


    //JWT生成的KEY的初始字符串
    public static final String JWTKEY="pockectstate_1902";
    //令牌失效时间 单位 分钟
    public static final int JWTTOKENTIME=30;

    //传递的消息头名称 记录令牌
    public static final String HEADERTOKEN="usertoken";

}

