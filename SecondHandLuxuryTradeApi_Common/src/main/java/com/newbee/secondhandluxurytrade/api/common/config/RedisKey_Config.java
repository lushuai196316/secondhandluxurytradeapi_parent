package com.newbee.secondhandluxurytrade.api.common.config;

/**
 *@Author feri
 *@Date Created in 2019/7/10 14:46
 * 基于Redis数据 对应的key的记录
 */
public class RedisKey_Config {
    //记录手机短信验证码  5分钟失效
    public static final String VCODE_CODE="vc:";
    //记录1分钟 1次
    public static final String VCODE_FIRST="vc_first:";
    //记录10分钟 3次
    public static final String VCODE_SECOND="vc_second:";
    //记录1小时 4次
    public static final String VCODE_THREE="vc_three:";
    //记录 1天 20次
    public static final String VCODE_FOUR="vc_four:";


    //记录登录令牌相关的Key
    public static final String JWTTOKEN_DEVICE="jwtdevice:";//手机号_设备类型_设备Mac地址
    public static final String JWTTOKEN_TOKEN="jwttoken:";//令牌

    //记录登录失败次数
    public static String LOGINERROR="loginerror:";//phone 失效期15分钟
    //记录冻结的账号
    public static String LOGINFORCE="loginforce:";//phone  失效期15分钟

}
