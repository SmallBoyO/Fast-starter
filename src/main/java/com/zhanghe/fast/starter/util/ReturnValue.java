package com.zhanghe.fast.starter.util;

import java.util.List;

import com.google.gson.Gson;
/**  
 * ReturnValue
 *   
 * @author Clevo  
 * @date 2017/12/11 21:32 
 */  
public class ReturnValue<T> {
	
	public ReturnValue(){
		super();
	}
	public ReturnValue(Integer ret, String message) {
		super();
		this.ret = ret;
		this.message = message;
	}
	
	public ReturnValue( Integer ret, String message,T obj ){
		super();
		this.ret = ret;
		this.message = message;
		this.obj = obj;
	}
	
	public ReturnValue( Integer ret, String message,List<T> result ){
		super();
		this.ret = ret;
		this.message = message;
		this.result = result;
	}
	
	public String toJson(){
		Gson gson = new Gson();
		return gson.toJson(this);
	}
	
	public Integer ret = 1;
	public String message;
	public T obj;
	public List<T> result;
	public PageUtil<T> page;

	public PageUtil<T> getPage() {
		return page;
	}

	public void setPage(PageUtil<T> page) {
		this.page = page;
	}

	public Integer getRet() {
		return ret;
	}
	public void setRet(Integer ret) {
		this.ret = ret;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	public List<T> getResult() {
		return result;
	}
	public void setResult(List<T> result) {
		this.result = result;
	}
}
