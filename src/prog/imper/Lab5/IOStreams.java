package prog.imper.Lab5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.Buffer;
import java.util.Scanner;

public class IOStreams {
	
	public static void copyFileBuffered(String input, String output)
	{
		try(BufferedReader br=new BufferedReader(new FileReader(input));
				PrintWriter pw=new PrintWriter(new FileWriter(output)))
		{
			String line;
			while((line=br.readLine())!=null)
			{
				pw.print(line);
			}
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
						
	}
	public static void copyFileReaderWriters(String input, String output)
	{
		try(Reader fr=new FileReader(input); Writer fw= new FileWriter(output))
		{int c;
			while((c=fr.read())!=-1)
			{
				fw.write(c);
			}
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
	public static void copyFileInputStream(String input, String output)
	{
		try(InputStream in=new FileInputStream(input);
				OutputStream out= new FileOutputStream(output))
		{
			int c;
			while((c=in.read())!=-1)
			{
				out.write(c);
			}
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
			
			
		
	}
	public static void main(String[] args) {
	
		// test 1
		copyFileBuffered("in.txt", "out.txt");
		
		// test 2
		copyFileReaderWriters("in2.txt", "out2.txt");
		
		// test 3
		copyFileInputStream("in3.txt", "out3.txt");
		System.out.println("Zrobione");

	}

}
