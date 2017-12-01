package com.zhanghe.fast.starter.util;

import java.util.List;

import com.baomidou.mybatisplus.plugins.Page;
import com.google.gson.Gson;

public class PageUtil<T> {
	
    private Long correntPage;
    private Long pageSize;
    private Long total;
    
    private List<T> result;
    
    private Page<T> page;
    
    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public Long getCorrentPage() {
        return correntPage;
    }

    public void setCorrentPage(Long correntPage) {
        this.correntPage = correntPage;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
    
    public Page<T> toPage(){
    	Page<T> page =  new Page<T>(getCorrentPage().intValue(), getPageSize().intValue());
    	this.page = page;
    	return page;
    }
    
    public void setTotal(){
    	this.total = (long) this.page.getTotal();
    }
    
	@Override
	public String toString() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}
    
    
}
