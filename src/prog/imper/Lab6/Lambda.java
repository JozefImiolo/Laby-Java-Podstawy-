package prog.imper.Lab6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import prog.imper.Lab5.Person1;

public class Lambda {

	public static void main(String[] args) {
		List<Person1> persons = Arrays.asList(new Person1("zJahghghgfhfhn", "Kowalsk", "1"),
				new Person1("gdgdgJan", "gfgKowalski", "1"), new Person1("ggJan", "Kowalski", "1"));
		Collections.sort(persons, (pa, pb) -> pb.getFirstName().length() - pa.getFirstName().length());
		System.out.println(persons);

		ComparisonProvider comparisonProvider = new ComparisonProvider();
		Collections.sort(persons, comparisonProvider::compareByFirstName);
		System.out.println(persons);

		persons.forEach(System.out::println);
		persons.forEach(p -> System.out.println(p.getFirstName() + " "));
		System.out.println();

		System.out.println(persons.stream().filter(p -> p.getLastName().endsWith("ski")).count());
		// List<Person1> Ko=persons.stream().filter(p->p.getLastName().startsWith("Ko").collect(Collectors.toList()));
		// System.out.println(persons.stream().map(p->p.getFirstName().length().reduce((x,y)->x+y)).get()));

		Comparator<Person1> compB = new Comparator<Person1>() {
			public int compare(Person1 o1, Person1 o2) {
				return o1.getLastName().length() - o2.getFirstName().length();
			}

		};

		Person1[] persons1 = { new Person1("zJahghghgfhfhn", "Kowalsk", "1"),
				new Person1("gdgdgJan", "gfgKowalski", "1"), new Person1("ggJan", "Kowalski", "1") };

		Arrays.sort(persons1, compB);
		System.out.println(Arrays.toString(persons1));
//
		Comparator<Person1> compL = (pa, pb) -> pa.getFirstName().length() - pb.getFirstName().length();
		Arrays.sort(persons1, compL);
		System.out.println(Arrays.toString(persons1));

		ComparisonProvider comprovide = new ComparisonProvider();
		Arrays.sort(persons1, comprovide::compareByFirstName);
		System.out.println(Arrays.toString(persons1));
		Arrays.sort(persons1, comprovide::compareByLastName);
		System.out.println(Arrays.toString(persons1));

	}

}
