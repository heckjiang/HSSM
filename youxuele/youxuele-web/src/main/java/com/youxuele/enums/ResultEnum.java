package com.youxuele.enums;

/**
 * 业务异常基类，所有业务异常都必须继承于此异常 定义异常时，需要先确定异常所属模块。 例如：无效用户可以定义为 [10010001]
 * 前四位数为系统模块编号，后4位为错误代码 ,唯一。
 * 
 * @author jiangjun
 *
 */
public enum ResultEnum {

	// 数据库操作异常
	DB_INSERT_RESULT_ERROR(99990001, "db insert error"),
	DB_UPDATE_RESULT_ERROR(99990002, "db update error"),
	DB_SELECTONE_IS_NULL(99990003,"db select return null"),

	// 系统异常
	INNER_ERROR(ResultCode.INNER_ERROR, "系统错误"), 
	TOKEN_IS_ILLICIT(ResultCode.USER_NOT_AUTHORIZED, "Token验证非法"), 
	SESSION_IS_OUT_TIME(ResultCode.SESSION_IS_OUT_TIME, "会话超时"),

	// 用户相关异常
	INVALID_USER(ResultCode.UC_USER_NOT_EXIST, "无效用户");

	private int errorCode;

	private String msg;

	ResultEnum(int errorCode, String msg) {
		this.errorCode = errorCode;
		this.msg = msg;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getMsg() {
		return msg;
	}

	public static ResultEnum stateOf(int index) {
		for (ResultEnum errorCode : values()) {
			if (errorCode.getErrorCode() == index) {
				return errorCode;
			}
		}
		return null;
	}

}
