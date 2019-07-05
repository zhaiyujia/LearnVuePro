package com.vue.dao;

import com.vue.domin.UserInfo;

import java.util.List;

/**
 * @author zhaiyj
 * @date 2019/7/5 19:12
 * @instruction
 */
public interface  UserMapper {
	List<UserInfo> getAll();
}
