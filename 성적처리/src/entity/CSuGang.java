package entity;

import java.io.Serializable;

public class CSuGang implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5337486138121800889L;
	private int gangjwaID,gwamokID;
	private String gangjwaName,userID;
	public int getGangjwaID() {return gangjwaID;}
	public void setGangjwaID(int gangjwaID) {this.gangjwaID = gangjwaID;}
	public int getGwamokID() {	return gwamokID;}
	public void setGwamokID(int gwamokID) {this.gwamokID = gwamokID;}
	public String getGangjwaName() {return gangjwaName;}
	public void setGangjwaName(String gangjwaName) {this.gangjwaName = gangjwaName;}
	public String getUserID() {return userID;}
	public void setUserID(String userID) {this.userID = userID;}
	
}
