package view;

import java.io.FileNotFoundException;
import java.util.Scanner;

import DAO.IDAO;
import DAO.TextDAO;
import control.CLoginControl;
import control.CSugangControl;
import entity.VUser;
import entity.VLogin;
import exception.PasswordNotFoundException;
import exception.UserIDNotFoundException;

public class CLoginView extends CView{
	public void login() 
			throws FileNotFoundException, 
			PasswordNotFoundException, 
			UserIDNotFoundException
	{
		String userID=null,password=null;
		VLogin vLogin=new VLogin();
		Scanner scan =new Scanner(System.in);
		System.out.print("아이디와 비밀번호를 입력해 주세요.\n\n 아이디:	");
		
		userID=scan.next();
		vLogin.setUserID(userID);
		
		System.out.print(" 비밀번호:	");
		password=scan.next();
		vLogin.setPassword(password);
		
		scan.close();
		
		VUser vUser = (VUser)((CLoginControl)this.getControl()).login(vLogin);
		System.out.println("login result: " +vUser.getName());
		
		//start sugang
		try {
			//view
			CSugangView sugangView = new CSugangView();
			
			//control
			CSugangControl sugangControl = new CSugangControl();
			
			//dao
			IDAO dao = new TextDAO();
			
			//associates
			sugangView.setControl(sugangControl);
			sugangControl.setDao(dao);
		
			sugangView.sugang(userID);
		}catch (Exception e) {
			// TODO Auto-generated catch block
			CExceptionView.processException(e);
		}
	}
}
