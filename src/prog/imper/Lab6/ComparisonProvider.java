package prog.imper.Lab6;


import prog.imper.Lab5.Person1;

public class ComparisonProvider  {

	public int compareByFirstName(Person1 o1, Person1 o2)
	{
		
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
	public int compareByLastName(Person1 o1, Person1 o2)
	{
		
		return o1.getLastName().compareTo(o2.getLastName());
	}



}