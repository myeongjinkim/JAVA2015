package view;

import java.io.File;
import java.util.Scanner;

import entity.CMember;

public class CLoginView {
	
	public CMember[] login()
	{
		String fileName = "IDPASSinput.txt";
		try{
			Scanner scan = new Scanner(new File(fileName));
			CMember[] member = new CMember[10];
		
			String UserID, Password;
			int i,a=0;	
			for(i=0; a==0;i++)
			{
				try
				{
					member[i] = new CMember();
					UserID = scan.next();
					member[i].setUserID(UserID);
					Password = scan.next();
					member[i].setPassword(Password);
				}catch(Exception e)
				{
					a=1;
				}
			}
			scan.close();
			return member;
		}
		catch(Exception e)
		{
			System.out.println("아이디와 비밀번호 파일을 불러오는데 실패했습니다.");
			return null;
		}
	}
}
