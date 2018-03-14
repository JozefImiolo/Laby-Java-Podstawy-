package prog.imper.Lab6;


import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Nio {

	public static void main(String[] args) {
	Path file =Paths.get("in.txt");
	List<String> lines;
	try {
		lines=Files.readAllLines(file);
		System.out.print(lines);
	
	} catch (IOException e) {
	e.printStackTrace();
	}
	
	Path dir=Paths.get(".");
	try  (DirectoryStream<Path> stream=Files.newDirectoryStream(dir, "*.txt")){
		for( Path p: stream)
		{System.out.print(p.getFileName());
		}
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}
}
