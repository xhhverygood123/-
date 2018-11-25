package com.fh.common;


import com.fh.IEnum;

public enum ResponseEnum implements IEnum {
	;
   private Integer code;
   private String massage;
   
   
   private ResponseEnum (Integer code,String massage){
	   this.code=code;
	   this.massage=massage;
   }
   
	public Integer getCode() {
		return code;
	}
	public String getMassage() {
		return massage;
	}
   
   
   
   
   
}