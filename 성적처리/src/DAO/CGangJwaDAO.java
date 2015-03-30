package DAO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import entity.CGangJwa;

public class CGangJwaDAO {
public CGangJwa read() { return null; }
	
	public void write(CGangJwa gangjwa)
	{
		System.out.println("\n°­ÁÂID : " + gangjwa.getID());
		System.out.println("°­ÁÂ¸í: " + gangjwa.getName());
		File file= new File("gangjwatestOutput");
		
			try {
				ObjectOutputStream out=
				new ObjectOutputStream(new FileOutputStream(file));
				out.writeObject(gangjwa);
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
	}; 
}
