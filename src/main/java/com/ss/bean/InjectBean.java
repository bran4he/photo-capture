package com.ss.bean;

public class InjectBean {

	private String name;
	private String content;

	public InjectBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InjectBean(String name, String content) {
		super();
		this.name = name;
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
