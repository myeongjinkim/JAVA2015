package DAO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import entity.CGwamok;

public class CGwamokDAO {
public CGwamok read() { return null; }
	
	public void write(CGwamok gwamok)
	{
		System.out.println("과목ID: "+ gwamok.getID());
		System.out.println("과목명: "+ gwamok.getName());
		File file= new File("gwamoktestOutput");
		try{
			ObjectOutputStream out=
				new ObjectOutputStream(new FileOutputStream(file));
			out.writeObject(gwamok);
			out.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}; 
}

