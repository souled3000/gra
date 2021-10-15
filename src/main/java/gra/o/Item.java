package gra.o;

import java.util.Date;

public class Item {
	
	public Long id;
	public String factoryStaff;
	public String factory;
	public String dept;
	public String deptStaff;
	public String admin;
	public String room;
	public Date signinTime;
	public Date preSignoutTime;
	public Date signoutTime;
	public int status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFactoryStaff() {
		return factoryStaff;
	}
	public void setFactoryStaff(String factoryStaff) {
		this.factoryStaff = factoryStaff;
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDeptStaff() {
		return deptStaff;
	}
	public void setDeptStaff(String deptStaff) {
		this.deptStaff = deptStaff;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public Date getSigninTime() {
		return signinTime;
	}
	public void setSigninTime(Date signinTime) {
		this.signinTime = signinTime;
	}
	public Date getPreSignoutTime() {
		return preSignoutTime;
	}
	public void setPreSignoutTime(Date preSignoutTime) {
		this.preSignoutTime = preSignoutTime;
	}
	public Date getSignoutTime() {
		return signoutTime;
	}
	public void setSignoutTime(Date signoutTime) {
		this.signoutTime = signoutTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
