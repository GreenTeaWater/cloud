package com.cloud.common.pay.common.dto;

import java.io.Serializable;

public class PaymentOrderDTO implements Serializable{

	private static final long serialVersionUID = -7394340223720001375L;

	private String id ;
	
	private String name ;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PaymentOrderDTO [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
