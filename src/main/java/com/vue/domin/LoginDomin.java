package com.vue.domin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhaiyj
 * @date 2019/6/29 15:44
 * @instruction
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDomin {

	private String id;
	private String email;
	private String password;

}
