package com.newbee.secondhandluxurytrade.api.common.utils;

import com.alibaba.fastjson.JSON;
import com.pockectstate.api.common.model.JuheSms;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/*
*基于聚合数据，实现短信验证码的发送*/
public class JuHeSms_Util {

      public static final String SMS_URL="http://v.juhe.cn/sms/send";
      public static final int TPL_ID=171667;
      public static final String SMS_KEY="83b558172e73ad1ea0fd874a4f4cc399";

      public static boolean sendMsg(String phone,int code) throws UnsupportedEncodingException {
            StringBuffer buffer = new StringBuffer(SMS_URL);
            buffer.append("?mobile="+phone);
            buffer.append("&tpl_id="+TPL_ID);
            buffer.append("&tpl_value="+ URLEncoder.encode("#code#="+code,"UTF-8"));
            buffer.append("&key="+SMS_KEY);
            String json = Http_Util.getStr(buffer.toString());
            if(json!=null){
                  JuheSms sms = JSON.parseObject(json, JuheSms.class);
                  return sms.getError_code()==0;
            }
            return false;
      }
}
