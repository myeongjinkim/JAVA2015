package 성적처리v03;

import view.CGangJwaView;
import view.CGwamokView;
import view.CLoginView;
import view.CSuGangView;
import DAO.DAO;
import control.CGangJwaControl;
import control.CGwamokControl;
import control.CLoginControl;
import control.CSuGangControl;
import entity.CGangJwa;
import entity.CGwamok;
import entity.CMember;
import entity.CSuGang;

public class CMain {
	public static void main(String[] arg){
		// login
		CLoginView loginview = new CLoginView();
		CMember[] member = loginview.login();
		CLoginControl logincontrol =new CLoginControl();
		member = logincontrol.login(member);
		DAO memberDAO= new DAO();
		memberDAO.write(member,"IDPASSoutput");
		member=(CMember[]) memberDAO.read("IDPASSoutput");//type casting
		//과목개설
		CGwamokView gwamokView=new CGwamokView();
		CGwamok gwamok = gwamokView.getGwamok();
		CGwamokControl gwamokControl =new CGwamokControl();
		gwamok=gwamokControl.processgwamok(gwamok);
		DAO gwamokDAO =new DAO();
		gwamokDAO.write(gwamok, "gwamoktestOutput");
		gwamok=(CGwamok) gwamokDAO.read("gwamoktestOutput");//type casting
		
		//강좌개설
		CGangJwaView gangjwaView=new CGangJwaView();
		CGangJwa gangjwa = gangjwaView.getgangjwa();
		CGangJwaControl gangjwaControl =new CGangJwaControl();
		gangjwa=gangjwaControl.processgangjwa(gangjwa);
		DAO gangjwaDAO =new DAO();
		gangjwaDAO.write(gangjwa, "gangjwatestOutput");
		gangjwa=(CGangJwa) gangjwaDAO.read("gangjwatestOutput");
		
		//수강신청
		CSuGangView sugangView=new CSuGangView();
		CSuGang sugang = sugangView.getsugang();
		CSuGangControl sugangControl =new CSuGangControl();
		sugang=sugangControl.processsugang(sugang);
		DAO sugangDAO =new DAO();
		sugangDAO.write(sugang, "sugangtestOutput");
		sugang=(CSuGang) sugangDAO.read("sugangtestOutput");
		
	}
}
