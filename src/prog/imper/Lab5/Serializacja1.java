package prog.imper.Lab5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializacja1 {
	public void serializePerson(String filename)
	{
		Person1 ja=new Person1("Józef", "Imio³o", "xxxxxxxxxxx");
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename)))
		{
			out.writeObject(ja);
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
	public void deserializePerson(String filename)
	{
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename)))
		{
			Person1 p=(Person1)in.readObject();
			System.out.println(p);
		}
		catch(IOException | ClassNotFoundException ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
		Serializacja1 serial=new Serializacja1();
		serial.serializePerson("serializacja.txt");
		serial.deserializePerson("serializacja.txt");
		

	}

}
