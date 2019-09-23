package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
private int userid;
private int project_id;
private int group_id;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public int getProject_id() {
	return project_id;
}
public void setProject_id(int project_id) {
	this.project_id = project_id;
}
public int getGroup_id() {
	return group_id;
}
public void setGroup_id(int group_id) {
	this.group_id = group_id;
}
public String getUname() {
	return Uname;
}
public void setUname(String uname) {
	Uname = uname;
}
private String Uname;


}
