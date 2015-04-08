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
		System.out.print("아이디와 비밀번호를 입력해 주세요.\n\n 아이디:	");
		userID=scan.next();
		System.out.print(" 비밀번호:	");
		password=scan.next();
		
		scan.close();
		Login= this.getControl().process(member, userID, password);
		if(Login==1)
		{
			System.out.println("\n환영합니다.\n");
		}
		else if(Login==2)
		{
			System.out.println("\n비밀번호가 틀렸습니다\n");
		}
		else if(Login==3)
		{
			System.out.println("\n사용자 아이디가 없습니다\n");
		}
	}
}
