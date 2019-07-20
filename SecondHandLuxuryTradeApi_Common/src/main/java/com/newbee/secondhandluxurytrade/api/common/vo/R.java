package com.newbee.secondhandluxurytrade.api.common.vo;

import com.pockectstate.api.common.config.ResultJson_Config;
import lombok.Data;

@Data
public class R<T> {

    private int code;
    private String msg;
    private T data;

    public R(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public R(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public R() {
    }


    public static <T> R setOk(String msg, T obj){
        R r = new R(ResultJson_Config.OK, msg);
        r.setData(obj);
        return  r;
    }

    public static <T> R setERROR(String msg, T obj){
        R r = new R(ResultJson_Config.ERROR, msg);
        r.setData(obj);
        return  r;
    }

    public static <T>R setR(boolean issuccess ,String msg, T obj){
      R r;
      if(issuccess){
          r=new R(ResultJson_Config.OK,msg);
      }else {
          r=new R(ResultJson_Config.ERROR,msg);
      }
      r.setData(obj);
        return  r;
    }
}
