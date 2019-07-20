package com.newbee.secondhandluxurytrade.api.common.psenum;

public enum WalletLogType {

    sign(1),commission(2),balance(3),order(4),lottery(5);
    private int index;
    private WalletLogType(int index){
        this.index=index;
    }

    public int getIndex() {
        return index;
    }
}
