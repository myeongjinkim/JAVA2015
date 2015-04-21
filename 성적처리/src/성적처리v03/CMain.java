package 己利贸府v03;

import view.CExceptionView;
import view.CLoginView;
import DAO.IDAO;
import DAO.TextDAO;
import control.CLoginControl;

public class CMain {
	
	public static void main(String[] arg){
		// login
		
		
		//start login
		try {
			//view
			CLoginView loginView = new CLoginView();
	   
			//control
			CLoginControl loginControl = new CLoginControl();
			
			// dao
			IDAO dao = new TextDAO();
		
			//associates
			loginView.setControl(loginControl);
			loginControl.setDao(dao);
			
			loginView.login();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CExceptionView.processException(e);
		}

	}
}
