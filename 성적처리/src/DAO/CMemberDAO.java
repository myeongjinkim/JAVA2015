package DAO;

import java.io.File;
import java.io.FileWriter;

import entity.CMember;

public class CMemberDAO {
	public CMember read() { return null; }
	
	public void write(CMember[] member)
	{
		int i,a=0;
		String fileName= "IDPASSoutput.txt";
		FileWriter FWIDPW;
		try{
			FWIDPW=new FileWriter(new File(fileName));
			for(i=0; a==0; i++)
			{
				try{
					FWIDPW.write(member[i].getUserID());
					FWIDPW.write(" ");
					FWIDPW.write(member[i].getPassword());
					FWIDPW.write("\r\n");
					System.out.println((i+1)+"���� ID�� Password�� �����߽��ϴ�\n");
				}catch(Exception e)
				{
					a=1;
				}
			}
			FWIDPW.close();
		}catch(Exception e)
		{
			System.out.println("ID�� Password�� �����ϴµ� �����߽��ϴ�");
		}
	}; 
}