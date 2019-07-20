package com.newbee.secondhandluxurytrade.api.common.dto;

import lombok.Data;

@Data
public class SignDto {
    private int maxSignDays;//连续签到的天数
    private int monthDays;//月签到的天数
    private int sumSignDays;//签到的总天数
    private int sumSignAward;//签到的总奖励
    private int uid;
}