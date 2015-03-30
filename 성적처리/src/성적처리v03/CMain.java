package 성적처리v03;

import DAO.CGangJwaDAO;
import DAO.CGwamokDAO;
import DAO.CMemberDAO;
import control.CGangJwaControl;
import control.CGwamokControl;
import control.CLoginControl;
import view.CGangJwaView;
import view.CGwamokView;
import view.CLoginView;
import entity.CGangJwa;
import entity.CGwamok;
import entity.CMember;

public class CMain {
	public static void main(String[] arg){
		// login
		CLoginView loginview = new CLoginView();
		CMember[] member = loginview.login();
		CLoginControl logincontrol =new CLoginControl();
		member = logincontrol.login(member);
		CMemberDAO memberDAO= new CMemberDAO();
		memberDAO.write(member);
		//과목개설
		CGwamokView gwamokView=new CGwamokView();
		CGwamok gwamok = gwamokView.getGwamok();
		CGwamokControl gwamokControl =new CGwamokControl();
		gwamok=gwamokControl.processgwamok(gwamok);
		CGwamokDAO gwamokDAO =new CGwamokDAO();
		gwamokDAO.write(gwamok);
		
		//강좌개설
		CGangJwaView gangjwaView=new CGangJwaView();
		CGangJwa gangjwa = gangjwaView.getgangjwa();
		CGangJwaControl gangjwaControl =new CGangJwaControl();
		gangjwa=gangjwaControl.processgangjwa(gangjwa);
		CGangJwaDAO gangjwaDAO =new CGangJwaDAO();
		gangjwaDAO.write(gangjwa);
		
	}
}
