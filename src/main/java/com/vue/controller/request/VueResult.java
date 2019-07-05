package com.vue.controller.request;

import lombok.Data;

/**
 * @author zhaiyj
 * @date 2019/6/29 15:36
 * @instruction
 */
@Data
public class VueResult<T> {
	private int errCode;
	private String errMsg;
	private T data;
}
