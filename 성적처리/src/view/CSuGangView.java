package view;

import java.util.Scanner;

import entity.CSuGang;

public class CSuGangView {

	public CSuGang getsugang() {
		// TODO Auto-generated method stub
		int gangjwaID=0,gwamokID = 0;
		CSuGang sugang =new CSuGang();
		sugang.setGwamokID(0001);
		sugang.setGangjwaID(1001);
		sugang.setGangjwaName("자바");
		sugang.setUserID("김명진");
		System.out.println(sugang.getUserID()+"님의 수강신청 강좌입니다.");
		System.out.println("과목번호	강좌번호	장좌명");
		System.out.print(sugang.getGwamokID());
		System.out.print("	"+sugang.getGangjwaID());
		System.out.println("	"+sugang.getGangjwaName()+"\n");
		System.out.println("수강을 원하시는 강좌의 과목번호와 강좌번호를 입력해 주세요.");
		Scanner scan =new Scanner(System.in);
		gwamokID=scan.nextInt();
		gangjwaID=scan.nextInt();
		scan.close();
		if(sugang.getGwamokID()==gwamokID&&sugang.getGangjwaID()==gangjwaID)
		{
			System.out.print("\n"+sugang.getGwamokID());
			System.out.print(" "+sugang.getGangjwaID());
			System.out.println(" "+sugang.getGangjwaName());
			System.out.println("의 강좌를 선택하셨습니다.");
		}
		else
		{
			System.out.println("그런 강좌가 없습니다.");
			return null;
		}
		return sugang;
	}

}
