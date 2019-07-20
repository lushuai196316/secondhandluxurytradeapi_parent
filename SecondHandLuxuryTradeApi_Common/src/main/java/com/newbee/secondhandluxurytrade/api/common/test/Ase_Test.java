package com.newbee.secondhandluxurytrade.api.common.test;

import com.pockectstate.api.common.utils.EncryptionUtil;
import org.junit.Test;

public class Ase_Test {

    @Test
    public void t1(){
        // 生产密钥
        String key = EncryptionUtil.createAESKEY();
        System.out.println(key);

        //加密
        String pass="123456";
        String mq = EncryptionUtil.AESEnc(key, pass);
        System.out.println("AES密文："+mq);
        //解密
        System.out.println("AES明文："+EncryptionUtil.AESDec(key,mq));



    }

}
