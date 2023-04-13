package com.springmicroservice.Address.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String lane1;
	private String lane2;
	private String state;
	private long zip;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLame1() {
		return lane1;
	}
	public void setLame1(String lame1) {
		this.lane1 = lame1;
	}
	public String getLame2() {
		return lane2;
	}
	public void setLame2(String lame2) {
		this.lane2 = lame2;
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
