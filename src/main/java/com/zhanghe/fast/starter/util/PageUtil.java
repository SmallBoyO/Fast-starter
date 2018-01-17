package com.zhanghe.fast.starter.util;

import java.util.List;

import com.google.gson.Gson;
/**  
 * PageUtil
 *   
 * @author Clevo  
 * @date 2017/12/11 21:32 
 */  
public class PageUtil<T> {
	
    private Long correntPage;
    private Long pageSize;
    private Long total;
    
    private List<T> result;
    
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

	@Override
	public String toString() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}
    
    
}
