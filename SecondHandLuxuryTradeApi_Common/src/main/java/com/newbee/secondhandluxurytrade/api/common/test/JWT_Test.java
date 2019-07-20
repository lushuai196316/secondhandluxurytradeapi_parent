package com.newbee.secondhandluxurytrade.api.common.test;

import com.pockectstate.api.common.utils.IdGenerator;
import com.pockectstate.api.common.utils.Jwt_Util;
import org.junit.Test;

public class JWT_Test {
    @Test
    public void ti(){
        String m= "12351254265265";
        IdGenerator idGenerator = new IdGenerator(); // 生产唯一id;
        String token = Jwt_Util.createJWT(idGenerator.nextId()+"", 30, "hahhahahah");
        System.out.println("JWT"+token);


        System.out.println("JWT解析"+Jwt_Util.parseJWT(token));
    }

}
