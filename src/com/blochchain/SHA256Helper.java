package com.blochchain;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class SHA256Helper {

    public static String generateHash(String data){
        StringBuilder hexaDecimalString=new StringBuilder();
        try{
            MessageDigest messageDigest=MessageDigest.getInstance("SHA-256");
            byte[] hash=  messageDigest.digest(data.getBytes(StandardCharsets.UTF_8));

            for (int i = 0; i < hash.length; i++) {
                String hexaDecimalValue=Integer.toHexString(0xff & hash[i]);
                if(hexaDecimalValue.length()==1){
                    hexaDecimalString.append("0");
                }
                hexaDecimalString.append(hexaDecimalValue);
            }
        }catch (Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(" Something went wrong....");
        }
        return hexaDecimalString.toString();
    }
}
