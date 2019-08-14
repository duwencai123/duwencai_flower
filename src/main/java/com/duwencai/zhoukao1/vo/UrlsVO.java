package com.duwencai.zhoukao1.vo;

import java.io.Serializable;

import com.duwencai.zhoukao1.domain.Urls;

public class UrlsVO extends Urls implements Serializable{

	private static final long serialVersionUID = 1L;
	private String orderByColumn;//排序的字段
	private String orderByMethod;//排序方式
	public String getOrderByColumn() {
		return orderByColumn;
	}
	public void setOrderByColumn(String orderByColumn) {
		this.orderByColumn = orderByColumn;
	}
	public String getOrderByMethod() {
		return orderByMethod;
	}
	public void setOrderByMethod(String orderByMethod) {
		this.orderByMethod = orderByMethod;
	}
	
	
	
}
