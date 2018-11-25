package com.fh.util;


public enum ResponseEnum implements IEnum{


	;
   private Integer code;
   private String Massage;
   
   
   private ResponseEnum (Integer code,String massage){
	   this.code=code;
	   this.Massage=massage;
   }


	@Override
	public int getCode() {
		return this.code;
	}

	@Override
	public String getMassage() {
		return this.Massage;
	}
}