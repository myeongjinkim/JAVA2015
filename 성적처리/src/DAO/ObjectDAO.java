package DAO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import entity.CEntity;

             
public class ObjectDAO implements IDAO{
	
	public CEntity[] read(CEntity[] entity, String filename)
	{
		Object object =null;
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(filename));
			object= in.readObject();
			in.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (CEntity[])object;
	}
	public void write(Object object, String filename)
	{
		//CEntity entity =new CGangJwa();
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