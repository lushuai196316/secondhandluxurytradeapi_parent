package com.newbee.secondhandluxurytrade.api.common.utils;

import java.util.Random;

public class Random_Util {

    // 根据传递的位数，生产指定长度的随机数

    public static int createNum(int len){
        Random random = new Random();
       int num = (int)Math.pow(10, len - 1);
      return random.nextInt ((int)Math.pow(10, len)-num) +num;
    }

}
