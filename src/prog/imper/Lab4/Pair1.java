package prog.imper.Lab4;

import java.io.Serializable;

public class Pair1 <T,S> implements Serializable{
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair1 other = (Pair1) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (second == null) {
			if (other.second != null)
				return false;
		} else if (!second.equals(other.second))
			return false;
		return true;
	}


	private T first;
	private S second;
	
	public Pair1 (T first, S second)
	{
		super();
		this.first=first;
		this.second=second;
	}
	public T getFirst()
	{
		return this.first;
	}
	public S getSecond()
	{
		return this.second;
	}
	public void setFirst(T first)
	{
		this.first=first;
	}
	public void setSecond(S second)
	{
		this.second=second;
	}
	public String toString()
	{
		return " Pierwsze: "+first+", drugie: "+ second;
	}
	
	public static void main(String[] args) {
		Pair1<String, Integer> para1=new Pair1<>("fdsfsdf", 344);
		Pair1<String, Integer> para2=new Pair1<>("fdsfsdf", 344);
		System.out.println(" Pierwsze: "+para1.getFirst()+", drugie: "+ para1.getSecond());
		System.out.println(para1.hashCode()+" == " + para2.hashCode());

	}

}
