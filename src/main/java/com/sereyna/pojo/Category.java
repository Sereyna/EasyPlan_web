package com.sereyna.pojo;

import org.springframework.stereotype.Component;

@Component
public class Category {
	private int cid;
	private String name;
	public int getId() {
		return cid;
	}
	public void setId(int id) {
		this.cid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Category [id=" + cid + ", name=" + name + "]";
	}
	
	
	
}
