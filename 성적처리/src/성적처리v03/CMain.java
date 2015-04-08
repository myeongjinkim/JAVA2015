package 己利贸府v03;


import view.CLoginView;
import DAO.IDAO;
import DAO.TextDAO;
import control.CLoginControl;

public class CMain {
	public static void main(String[] arg){
		// login
		
		//create object
		CLoginView loginView = new CLoginView();	
		CLoginControl loginControl = new CLoginControl();
		IDAO dao = new TextDAO();
	
		//associates
		loginView.setControl(loginControl);
		loginControl.setDao(dao);
		
			
		//start login
		loginView.login();

	}
}
