package com.springmicroservice.Address.response;

public class AddressResponse {

	private int id;
	private String lame1;
	private String lame2;
	private String state;
	private long zip;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLame1() {
		return lame1;
	}
	public void setLame1(String lame1) {
		this.lame1 = lame1;
	}
	public String getLame2() {
		return lame2;
	}
	public void setLame2(String lame2) {
		this.lame2 = lame2;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	
	
}
