package prog.imper.Lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MostPopularWord1 {

	public static void main(String[] args) {
		File file = new File("text.txt");
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String imie;
		Scanner odczyt = new Scanner(System.in);
		imie = odczyt.nextLine();
		odczyt.close();
		System.out.println("Witaj " + imie);

	}

}
