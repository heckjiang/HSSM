package com.youxuele.exception;

import com.youxuele.enums.ResultEnum;

/**
 * 
 * @author jiangjun
 * 
 */
public class BizException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private int errorCode = -1;
	private ResultEnum result;
	
	public BizException(String message) {
		super(message);
	}

	public BizException(String message, Throwable cause) {
		super(message, cause);
	}

	public BizException(int errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}
	
	public BizException(ResultEnum result) {
		super(result.getMsg());
		this.errorCode = result.getErrorCode();
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public ResultEnum getResult() {
		return result;
	}

	public void setResult(ResultEnum result) {
		this.result = result;
	}
	
}
