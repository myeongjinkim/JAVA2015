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
		sugang.setGangjwaName("�ڹ�");
		sugang.setUserID("�����");
		System.out.println(sugang.getUserID()+"���� ������û �����Դϴ�.");
		System.out.println("�����ȣ	���¹�ȣ	���¸�");
		System.out.print(sugang.getGwamokID());
		System.out.print("	"+sugang.getGangjwaID());
		System.out.println("	"+sugang.getGangjwaName()+"\n");
		System.out.println("������ ���Ͻô� ������ �����ȣ�� ���¹�ȣ�� �Է��� �ּ���.");
		Scanner scan =new Scanner(System.in);
		gwamokID=scan.nextInt();
		gangjwaID=scan.nextInt();
		scan.close();
		if(sugang.getGwamokID()==gwamokID&&sugang.getGangjwaID()==gangjwaID)
		{
			System.out.print("\n"+sugang.getGwamokID());
			System.out.print(" "+sugang.getGangjwaID());
			System.out.println(" "+sugang.getGangjwaName());
			System.out.println("�� ���¸� �����ϼ̽��ϴ�.");
		}
		else
		{
			System.out.println("�׷� ���°� �����ϴ�.");
			return null;
		}
		return sugang;
	}

}
