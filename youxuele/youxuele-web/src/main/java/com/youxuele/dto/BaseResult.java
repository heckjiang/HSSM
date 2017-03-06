package com.youxuele.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * 
 * @author jiangjun
 * 
 *         ajax 请求的返回类型封装JSON结果
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResult<T> implements Serializable {

	private static final long serialVersionUID = -4185151304730685014L;

	private boolean success;

	private T data;

	private int errorCode = -1;

	private String errorMsg;

	public BaseResult(boolean success, int errorCode, String errorMsg) {
		this.success = success;
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public BaseResult(int errorCode, String errorMsg) {
		this(false, errorCode, errorMsg);
	}

	public BaseResult(boolean success, T data) {
		this.success = success;
		this.data = data;
	}

	public BaseResult(T data) {
		this(true, data);
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	@Override
	public String toString() {
		return "BaseResult [success=" + success + ", data=" + data
				+ ", errorCode=" + errorCode + ", errorMsg=" + errorMsg + "]";
	}

}
