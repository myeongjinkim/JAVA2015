package entity;

import java.io.Serializable;

//Entity class or value class
public class CMember implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5337486138121800889L;
	private String userID,password; //attributes ¼Ó¼º
	public void setUserID(String userID){this.userID=userID;}
	public void setPassword(String password){this.password=password;}
	public String getUserID(){return this.userID;}
	public String getPassword(){return this.password;}
}
