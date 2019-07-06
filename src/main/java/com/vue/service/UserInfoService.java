package com.vue.service;

import com.vue.domin.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhaiyj
 * @date 2019/7/5 19:13
 * @instruction
 */import com.vue.dao.UserMapper;

@Service
@Slf4j
public class UserInfoService {

	@Autowired
	UserMapper userMapper;


	public UserInfo getUserInfo(String id){
		return userMapper.getAll().stream().findFirst().get();
	}

}
