package control;

import java.io.FileNotFoundException;


import entity.CUser;
import entity.VLogin;
import entity.VUser;
import exception.PasswordNotFoundException;
import exception.UserIDNotFoundException;

public class CLoginControl extends CControl{
	
	
	public VUser login(VLogin vLogin) throws FileNotFoundException,PasswordNotFoundException,UserIDNotFoundException
	{	// TODO Auto-generated method stub			
		VUser vUser = new VUser();
	
		CUser cUser =new CUser();
		this.getDao().connect("member.txt");
		cUser= (CUser)this.getDao().read(cUser,vLogin.getUserID());
		this.getDao().disconnect();
		//result 정리
		if(cUser==null)throw new UserIDNotFoundException();		{
		}
		if(!cUser.getPassword().equals(vLogin.getPassword()))
			throw new PasswordNotFoundException();{
		}
		//result 정리
		vUser.setName(cUser.getName());
		vUser.setUserID(cUser.getID());
		return vUser;
	}
}
