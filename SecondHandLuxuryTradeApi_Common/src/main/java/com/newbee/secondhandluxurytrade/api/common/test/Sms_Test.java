package com.newbee.secondhandluxurytrade.api.common.test;


import com.pockectstate.api.common.utils.JuHeSms_Util;
import com.pockectstate.api.common.utils.Random_Util;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class Sms_Test {

     @Test
    public void t1() throws UnsupportedEncodingException {
        int code = Random_Util.createNum(6);
        System.out.println(JuHeSms_Util.sendMsg("13526873831",code));
    }

}
