package com.vue.domin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhaiyj
 * @date 2019/6/29 16:03
 * @instruction
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
	private String email;
	private String password;
}
