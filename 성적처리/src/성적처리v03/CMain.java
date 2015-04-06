package 己利贸府v03;


import view.CLoginView;
import DAO.IDAO;
import DAO.TextDAO;
import control.CLoginControl;
import entity.CMember;

public class CMain {
	public static void main(String[] arg){
		// login
		CLoginView loginview = new CLoginView();
		CMember member = loginview.login();
		CLoginControl logincontrol =new CLoginControl();
		member = logincontrol.login(member);
		IDAO memberDAO= new TextDAO();
		//CMember members = new CMember();
		member= (CMember) memberDAO.read(member,"member.txt");//type casting
		//memberDAO.write(member,"memberOut.txt");
	
	}
}
