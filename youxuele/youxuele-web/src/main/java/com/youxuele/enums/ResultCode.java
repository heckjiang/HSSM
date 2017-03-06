package com.youxuele.enums;

public class ResultCode {
	/**
	 * 公共
	 */
	public static final int INNER_ERROR = -1; // 系统错误
	public static final int SUCCESSFULL = 0; // 操作成功
	public static final int FAILED = 1; // 操作失败
	public static final int NO_RESULT_FOUND = 2; // 没有匹配条件的结果
	public static final int ILLEGAL_REQUEST_PARAM = 10001; // 非法的请求参数
	public static final int USER_NOT_AUTHORIZED = 10002; // 用户未授权
	public static final int SESSION_IS_OUT_TIME = 10003; // 会话超时

	/**
	 * 用户中心
	 */
	public static final int UC_USER_NOT_EXIST = 20001; // 账号不存在
	public static final int UC_USER_EXISTED = 20002; // 账号已经存在
	public static final int UC_ACCOUNT_OR_PWD_ERROR = 20003; // 账号或密码错误
}
