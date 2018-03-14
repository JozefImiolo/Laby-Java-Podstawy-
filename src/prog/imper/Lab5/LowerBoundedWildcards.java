package prog.imper.Lab5;

import java.util.List;

public class LowerBoundedWildcards {

	public static void addPerson(List<? super Employee> list) {
		// Nie Mo¿na list.add(new Person1("Marek", "Liko", "fsdfdsf"));
		// Nie Mo¿na list.add(new Student("Marek", "Liko", "fsdfdsf"));
		list.add(new Employee("Marek", "Liko", "fsdfdsf"));
		list.add(new AcademicStuff("Maciek", "Liko", "fsdfdsf"));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
