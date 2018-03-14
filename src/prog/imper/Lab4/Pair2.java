package prog.imper.Lab4;

import prog.imper.Lab4.Enum1.Month;

public class Pair2 <T>{

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
		Pair2 other = (Pair2) obj;
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
		private T second;
		
		Pair2 (T first, T second)
		{
			super();
			this.first=first;
			this.second=second;
		}
		public T getFirst()
		{
			return this.first;
		}
		public T getSecond()
		{
			return this.second;
		}
		public void setFirst(T first)
		{
			this.first=first;
		}
		public void setSecond(T second)
		{
			this.second=second;
		}
		public String toString()
		{
			return " Pierwsze: "+first+", drugie: "+ second;
		}
		public void swap()
		{
			T tmp=first;
			first=second;
			second=tmp;
		}
		
		
		public static void main(String[] args) {
			Pair2<Integer> para1=new Pair2<>(1, 344);
			Pair2<Integer> para2=new Pair2<>(1, 344);
			System.out.println(para1);
			System.out.println(para2);
			System.out.println(para1.hashCode()+" == " + para2.hashCode());
			System.out.println(para1.equals(para2));
			para1.swap();
			System.out.println(para1);
			System.out.println(para2);
			System.out.println(para1.hashCode()+" == " + para2.hashCode());
			System.out.println(para1.equals(para2));
			
			Month holiday1 = Month.JULY;
			Month holiday2 = Month.AUGUST;
			
			Pair2<Month> holidayMonths = new Pair2<>(holiday1, holiday2);
			
			System.out.println("Holidays are in months: " + holidayMonths.getFirst().getName() + " and " 
					+ holidayMonths.getSecond().getName());

		}

	}
