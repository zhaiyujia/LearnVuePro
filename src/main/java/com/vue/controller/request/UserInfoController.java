package com.vue.controller.request;

import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author zhaiyj
 * @date 2019/7/22 19:17
 * @description
 */
@RestController
@RequestMapping("/api/mobile")
@CrossOrigin
public class UserInfoController {

    @GetMapping("user/UserVerifyMd5")
    public Map UserVerifyMd5(){
        Map result = Maps.newHashMap();
        result.put("code",0);
        result.put("isSucess",true);
        return result;
    }

    @GetMapping("user/GetUser")
    public Map GetUser(){
        Map result = Maps.newHashMap();
        result.put("code",0);
        result.put("isSucess",true);
        return result;
    }

}
