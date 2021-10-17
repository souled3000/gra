package gra.o;

import org.hibernate.validator.constraints.NotEmpty;

import gra.utils.MiscUtils;

public class User {
	// @NotEmpty(message="登录名不可为空")
	@NotEmpty(message = "{required.name}")
	private String name;
	// @NotEmpty(message="密码不可为空")
	@NotEmpty(message = "{required.pwd}")
	private String pwd;
	
	private String room;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public static void main(String[] arg){
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}
}
