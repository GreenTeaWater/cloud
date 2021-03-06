package com.cloud.mp.common.model;

import java.io.Serializable;

public class Personal implements Serializable{
	
	private static final long serialVersionUID = -2754600281555389811L;

	private Integer id;

    private String userName;

    private String password;

    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

	@Override
	public String toString() {
		return "Personal [id=" + id + ", userName=" + userName + ", password="
				+ password + ", age=" + age + "]";
	}
    
    
}