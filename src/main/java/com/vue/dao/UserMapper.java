package com.vue.dao;

import com.vue.domin.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhaiyj
 * @date 2019/7/5 19:12
 * @instruction
 */
@Repository
public interface  UserMapper {
	List<UserInfo> getAll();

	void deleteById(String id);
}
