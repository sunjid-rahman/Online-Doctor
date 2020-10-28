package model;

import java.io.Serializable;
import java.util.ArrayList;

public class UserInfo extends User implements Serializable {
	private String firstName;
	private String lastName;
	//private StringProperty email;
	private String bloodgroup;
	private Integer age;
	public UserInfo() {}
	public UserInfo(String firstName, String lastName, String email, String bloodgroup,
			Integer age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		//this.email = email;
		this.bloodgroup = bloodgroup;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
