package com.vue.controller;

import com.vue.controller.request.VueResult;
import com.vue.domin.LoginDomin;
import com.vue.domin.UserInfo;
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
@RequestMapping
@CrossOrigin
public class VueProTestController {


	@PostMapping("/test")
	public VueResult getTestMessage(@RequestBody UserInfo userInfo){
		System.out.println(userInfo.toString());
		VueResult result = new VueResult();
		result.setErrCode(200);
		result.setErrMsg("OK");
		result.setData(userInfo);
		return result;
	}


}
