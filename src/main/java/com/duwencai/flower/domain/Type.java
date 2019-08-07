package com.duwencai.flower.domain;
/**
 * 
 * @ClassName: Type 
 * @Description: TODO 
 * @author:杜文彩
 * @date: 2019年8月6日 上午11:09:07
 */
public class Type {
	
	private Integer tid;
	private String tname;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Type [tid=" + tid + ", tname=" + tname + "]";
	}
	

}
