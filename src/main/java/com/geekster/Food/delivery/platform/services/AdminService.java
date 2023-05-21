package com.geekster.Food.delivery.platform.services;

import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class AdminService {
    public static boolean isValidEmail(String email) {
        if(email!=null){
            Pattern p = Pattern.compile("^.*@headadmin\\.com$");

            Matcher m = p.matcher(email);
            if( (m.find() && m.group().equals(email))){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
