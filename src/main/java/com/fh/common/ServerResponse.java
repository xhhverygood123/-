package com.fh.common;

import com.fh.IEnum;

import java.io.Serializable;

public class ServerResponse<T> implements Serializable {

	private static final long serialVersionUID = -4817576126752090182L;
	
	private Integer code;
	private String massage;
	private T data;
	//无参构造方法
	public ServerResponse(){
		
	}
	//有参构造方法，需要返回数据的情况
	public ServerResponse(int code,String massage,T data){
		this.code=code;
		this.massage=massage;
		this.data=data;
	}
	//需要返回数据的情况
	public static <T> ServerResponse<T> success(T data){
		return new ServerResponse(200,"ok",data);
	}
	//不需要返回数据的情况
	public static ServerResponse success(){
		return new ServerResponse(200,"ok",null);
	}
	
	//异常处理
	public static ServerResponse error(){
		return new ServerResponse(-1,"error",null);
	}
	
	public static ServerResponse error(IEnum responseEnum){
		return new ServerResponse(responseEnum.getCode(),responseEnum.getMassage(),null);
	}

	
	public Integer getCode() {
		return code;
	}
	public String getMassage() {
		return massage;
	}
	public T getData() {
		return data;
	}
}
