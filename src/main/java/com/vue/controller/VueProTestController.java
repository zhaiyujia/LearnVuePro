package com.vue.controller;

import com.vue.controller.request.VueResult;
import com.vue.domin.LoginDomin;
import com.vue.domin.UserInfo;
import com.vue.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author zhaiyj
 * @date 2019/6/29 14:21
 * @instruction
 */
@RestController
@RequestMapping("/api/mobile")
@CrossOrigin
public class VueProTestController {

	@Autowired
	UserInfoService userInfoService;

	@PostMapping("/test")
	public UserInfo getTestMessage(@RequestBody UserInfo userInfo){
		UserInfo result = userInfoService.getUserInfo("1");
		return result;
	}

	@GetMapping("/users")
	public Map getUsers(){
		return userInfoService.getUsers();
	}

	@PostMapping("/delete")
	public String deleteUser(@RequestBody Map params){
		userInfoService.deleteUser(params.get("id").toString());
		return "delete sucess";
	}
}
