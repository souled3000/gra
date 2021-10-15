package gra.o;

import java.util.Date;

public class Item {
	
	public Long id;
	public String factorystaff;
	public String factory;
	public String dept;
	public String deptstaff;
	public String admin;
	public String room;
	public Date signintime;
	public Date preSignouttime;
	public Date signouttime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFactorystaff() {
		return factorystaff;
	}
	public void setFactorystaff(String factorystaff) {
		this.factorystaff = factorystaff;
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
	public String getDeptstaff() {
		return deptstaff;
	}
	public void setDeptstaff(String deptstaff) {
		this.deptstaff = deptstaff;
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
	public Date getSignintime() {
		return signintime;
	}
	public void setSignintime(Date signintime) {
		this.signintime = signintime;
	}
	public Date getPreSignouttime() {
		return preSignouttime;
	}
	public void setPreSignouttime(Date preSignouttime) {
		this.preSignouttime = preSignouttime;
	}
	public Date getSignouttime() {
		return signouttime;
	}
	public void setSignouttime(Date signouttime) {
		this.signouttime = signouttime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int status;
	
}
