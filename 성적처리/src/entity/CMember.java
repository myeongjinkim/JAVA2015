package entity;

import java.util.Scanner;



//Entity class or value class
public class CMember extends CEntity
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userID,password; //attributes ¼Ó¼º
	public void setUserID(String userID){this.userID=userID;}
	public String getUserID(){return this.userID;}
	public void setPassword(String password){this.password=password;}
	public String getPassword(){return this.password;}
	@Override
	public void read(Scanner scanner) {
		// TODO Auto-generated method stub
		userID=scanner.next();
		password=scanner.next();
	}
	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}
}
