package view;

import entity.CMember;

public class CLoginView {
	
	public CMember login()
	{
		CMember member=new CMember();
		member.setUserID("userID");
		member.setPassword("password");
		return member;
	}
}
