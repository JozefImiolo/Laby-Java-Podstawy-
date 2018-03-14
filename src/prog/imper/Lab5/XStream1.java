package prog.imper.Lab5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XStream1 {
	
	public void personToXML() {
		XStream xs=new XStream();
		Person1 p1=new Person1("Józef", "Imighfho³o", "34543535");
		xs.alias("person", Person1.class);
		String xml=xs.toXML(p1);
		
		try(PrintWriter out =new PrintWriter("test.xml")){
			xs.toXML(p1,out);
			System.out.println(xs.toXML(p1));
			//out.println(xml);
		}
		catch(IOException ex)
		{
			System.out.print(ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	public void xMlToPerson() {
		XStream xs = new XStream(new DomDriver());
		xs.alias("person", Person1.class);
		try {
			//Person1 p1=(Person1)xs.fromXML("test.xml");
			Person1 p1 = (Person1) xs.fromXML(new FileReader("test.xml"));
			System.out.println(p1);
		}
		catch(ClassCastException|IOException ex)
		{
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		XStream1 example= new XStream1();
		example.personToXML();
		System.out.println("-------------------");
		example.xMlToPerson();
		
	}

}
