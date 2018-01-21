package com.pack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
private int sid;
@Column(length=10)
private String sname;
@Column(length=10)
private String marks1;
@Column(length=10)
private String marks2;
@Column(length=10)
private String marks3;
@Override
public String toString() {
	return "Student [marks1=" + marks1 + ", marks2=" + marks2 + ", marks3=" + marks3 + ", sid=" + sid + ", sname="
			+ sname + "]";
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getMarks1() {
	return marks1;
}
public void setMarks1(String marks1) {
	this.marks1 = marks1;
}
public String getMarks2() {
	return marks2;
}
public void setMarks2(String marks2) {
	this.marks2 = marks2;
}
public String getMarks3() {
	return marks3;
}
public void setMarks3(String marks3) {
	this.marks3 = marks3;
}
}
