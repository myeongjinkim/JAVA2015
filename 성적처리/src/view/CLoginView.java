package view;

import java.util.Scanner;

import entity.CMember;

public class CLoginView extends CView{
	public void login()
	{
		int Login=0;
		String userID=null,password=null;
		CMember[] member=new CMember[10];
		Scanner scan =new Scanner(System.in);
		System.out.print("���̵�� ��й�ȣ�� �Է��� �ּ���.\n\n ���̵�:	");
		userID=scan.next();
		System.out.print(" ��й�ȣ:	");
		password=scan.next();
		
		scan.close();
		Login= this.getControl().process(member, userID, password);
		if(Login==1)
		{
			System.out.println("\nȯ���մϴ�.\n");
		}
		else if(Login==2)
		{
			System.out.println("\n��й�ȣ�� Ʋ�Ƚ��ϴ�\n");
		}
		else if(Login==3)
		{
			System.out.println("\n����� ���̵� �����ϴ�\n");
		}
	}
}
