package control;

import entity.CMember;

public class CLoginControl extends CControl{
	
	
	private CMember member;
	public CMember login(CMember member) {
		// TODO Auto-generated method stub
		this.member = member;
		return this.member;
	}
	
	
}
