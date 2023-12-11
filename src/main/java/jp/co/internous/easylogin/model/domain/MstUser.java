package jp.co.internous.easylogin.model.domain;

//データベーステーブルで設定した情報をJavaオブジェクトに関連づける

public class MstUser {
	private int id;          //id
	private String userName; //user_name
	private String password; //password
	private String fullName; //full_name
	
	public int getId() {
		return id;
	}
	public void setId(final int id) {
		this.id=id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(final String userName) {
		this.userName=userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(final String password) {
		this.password=password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(final String fullName) {
		this.fullName=fullName;
	}
}
