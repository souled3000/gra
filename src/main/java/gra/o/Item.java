package gra.o;

import java.util.Date;

public class Item {
	
	public Long id;
	public String factorystaff;
	public String factory;
	public String dept;
	public String deptstaff;
	public String adm;
	public String room;
	public Date signintime;
	public String strsignintime;
	public Date presignouttime;
	public String strpresignouttime;
	public String getAdm() {
		return adm;
	}
	public void setAdm(String adm) {
		this.adm = adm;
	}
	public Date signouttime;
	public String strsignouttime;

	public String getStrsignintime() {
		return strsignintime;
	}
	public void setStrsignintime(String strsignintime) {
		this.strsignintime = strsignintime;
	}
	public String getStrpresignouttime() {
		return strpresignouttime;
	}
	public void setStrpresignouttime(String strpresignouttime) {
		this.strpresignouttime = strpresignouttime;
	}
	public String getStrsignouttime() {
		return strsignouttime;
	}
	public void setStrsignouttime(String strsignouttime) {
		this.strsignouttime = strsignouttime;
	}
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

	public Date getPresignouttime() {
		return presignouttime;
	}
	public void setPresignouttime(Date presignouttime) {
		this.presignouttime = presignouttime;
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
