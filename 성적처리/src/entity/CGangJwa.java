package entity;

import java.io.Serializable;
import java.util.Vector;

public class CGangJwa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private int ID;
	private String name;
	private String suganginwon;
	private Vector<String> times;
	private int gyosuID;
	private int gangjwaID;
	
	public int getID() {return ID;}
	public void setID(int iD) {ID = iD;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getSuganginwon() {return suganginwon;}
	public void setSuganginwon(String suganginwon) {this.suganginwon = suganginwon;}
	public Vector<String> getTimes() {return times;}
	public void setTimes(Vector<String> times) {this.times = times;}
	public int getGyosuID() {return gyosuID;}
	public void setGyosuID(int gyosuID) {this.gyosuID = gyosuID;}
	public int getGangjwaID() {return gangjwaID;}
	public void setGangjwaID(int gangjwaID) {this.gangjwaID = gangjwaID;}
}