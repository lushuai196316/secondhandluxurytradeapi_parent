package com.newbee.secondhandluxurytrade.api.common.psenum;
// 基于枚举 定义用户日志类型
public enum LogType {

    register(1),login(2),findpassword(3),changeuserdetail(4),
    ;
    private int vlave;
    private LogType(int vlave){
        this.vlave=vlave;
    }


    public int getVlave() {
        return vlave;
    }

    public void setVlave(int vlave) {
        this.vlave = vlave;
    }
}
