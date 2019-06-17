package com.biz.model;

public class MarketVO {

	private String wh;
	private String ma;
	private String name;
	private int ga;
	private int fa;
	private int da;
	private int sa;
	
	
	
	
	public MarketVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MarketVO(String wh, String ma, String name, int ga, int fa, int da, int sa) {
		super();
		this.wh = wh;
		this.ma = ma;
		this.name = name;
		this.ga = ga;
		this.fa = fa;
		this.da = da;
		this.sa = sa;
	}
	public String getWh() {
		return wh;
	}
	public void setWh(String wh) {
		this.wh = wh;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGa() {
		return ga;
	}
	public void setGa(int ga) {
		this.ga = ga;
	}
	public int getFa() {
		return fa;
	}
	public void setFa(int fa) {
		this.fa = fa;
	}
	public int getDa() {
		return da;
	}
	public void setDa(int da) {
		this.da = da;
	}
	public int getSa() {
		return sa;
	}
	public void setSa(int sa) {
		this.sa = sa;
	}
	@Override
	public String toString() {
		return "MarketVO [wh=" + wh + ", ma=" + ma + ", name=" + name + ", ga=" + ga + ", fa=" + fa + ", da=" + da
				+ ", sa=" + sa + "]";
	}
	
	
	
	
	
}
