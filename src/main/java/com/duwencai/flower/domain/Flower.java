package com.duwencai.flower.domain;
/**
 * 
 * @ClassName: Flower 
 * @Description: TODO
 * @author:杜文彩 
 * @date: 2019年8月6日 上午11:08:50
 */
public class Flower {
	
	private Integer fid;
	private String fname;
	private String fdesc;
	private Integer tid;
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFdesc() {
		return fdesc;
	}
	public void setFdesc(String fdesc) {
		this.fdesc = fdesc;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	@Override
	public String toString() {
		return "Flower [fid=" + fid + ", fname=" + fname + ", fdesc=" + fdesc + ", tid=" + tid + "]";
	}
	
	

}
