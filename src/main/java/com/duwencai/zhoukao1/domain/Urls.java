package com.duwencai.zhoukao1.domain;

import java.util.Date;

/**
 * 
 * @ClassName: Urls 
 * @Description: TODO
 * @author: 杜文彩 
 * @date: 2019年8月11日 上午10:41:44
 */
public class Urls {
	
	private Integer id;
	private String url;
	private String date;//日期
	private Integer num;//url的编码
	
	public Urls( String url, String date, Integer num) {
		super();
		 
		this.url = url;
		this.date = date;
		this.num = num;
	}
	 
 	public Urls() {
		super();
	}
 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	
	
	
	

}
