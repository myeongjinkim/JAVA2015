package DAO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DAO{
	
	public Object read(String string) 
	{
		Object object =null;
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(string));
			object= in.readObject();
			in.close();
			return object;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public void write(Object object, String filename)
	{
		if(object!=null)
		{
			File file= new File(filename);		
			try {
				ObjectOutputStream out=
				new ObjectOutputStream(new FileOutputStream(file));
				out.writeObject(object);
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("정상적으로 저장되었습니다.\n");
		}
		else
		{
			System.out.println("파일저장에 실패했습니다.");
		}
	}; 
}