package com.newbee.secondhandluxurytrade.api.common.utils;


import com.pockectstate.api.common.config.Jwt_Config;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Date;

/*
实现对jwt的封装处理
*/
public class Jwt_Util {
    // 生产
    public static String createJWT(String id,int minutes,String content){
        //1、创建加密的技术-sha-256
        SignatureAlgorithm signatureAlgorithm= SignatureAlgorithm.HS256;
        //2、创建JWT建造者对象
        JwtBuilder jwtBuilder = Jwts.builder();
        //3、设置JWt相关信息
        jwtBuilder.setId(id);
        jwtBuilder.setIssuedAt(new Date());
        jwtBuilder.setExpiration(TimeUtil.getMinutes(minutes));//失效时间
        jwtBuilder.setSubject(content);//设置JWT中的内容
        jwtBuilder.signWith(signatureAlgorithm,createKey());
        //4、生成JWT
        return jwtBuilder.compact();
    }

    //解析
    public static String parseJWT(String token){
        SecretKey key=createKey();
        Claims claims=Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
        return claims.getSubject();
    }
    //校验
    public static boolean checkJWT(String token){
        String j=parseJWT(token);
        if(j==null || j.length()==0){
            return false;
        }else {
            return true;
        }
    }


    //生成秘钥
    private static SecretKey createKey(){
        byte[] keys= Jwt_Config.JWTKEY.getBytes();
        SecretKey key=new SecretKeySpec(keys,0,keys.length,"AES");
        return key;
    }
}
