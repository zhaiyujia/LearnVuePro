package com.vue.service;

import com.google.common.collect.Maps;
import com.vue.domin.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhaiyj
 * @date 2019/7/5 19:13
 * @instruction
 */import com.vue.dao.UserMapper;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class UserInfoService {

	@Autowired
	UserMapper userMapper;


	public UserInfo getUserInfo(String id){
		return userMapper.getAll().stream().findFirst().get();
	}

	public Map getUsers(){
		List<UserInfo> result =  userMapper.getAll();
		Map map = Maps.newHashMap();
		map.put("tableData",result);
		return map;
	}


	public void deleteUser(String id){
		userMapper.deleteById(id);
	}

}
