package prog.imper.Lab2;



public class Kandydat1 {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((imie == null) ? 0 : imie.hashCode());
		result = prime * result + ((nazwisko == null) ? 0 : nazwisko.hashCode());
		result = prime * result + ((pesel == null) ? 0 : pesel.hashCode());
		result = prime * result + pkt;
		result = prime * result + (subscribed ? 1231 : 1237);
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
		Kandydat1 other = (Kandydat1) obj;
		if (imie == null) {
			if (other.imie != null)
				return false;
		} else if (!imie.equals(other.imie))
			return false;
		if (nazwisko == null) {
			if (other.nazwisko != null)
				return false;
		} else if (!nazwisko.equals(other.nazwisko))
			return false;
		if (pesel == null) {
			if (other.pesel != null)
				return false;
		} else if (!pesel.equals(other.pesel))
			return false;
		if (pkt != other.pkt)
			return false;
		if (subscribed != other.subscribed)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Kandydat1 [imie=" + imie + ", nazwisko=" + nazwisko + ", pesel=" + pesel + ", pkt=" + pkt
				+ ", subscribed=" + subscribed + "]";
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public String getPesel() {
		return pesel;
	}
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	public int getPkt() {
		return pkt;
	}
	public void setPkt(int pkt) {
		this.pkt = pkt;
	}
	public boolean isSubscribed() {
		return subscribed;
	}
	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}
	private String imie;
	private String nazwisko;
	private String pesel; 
	private int pkt;
	private boolean subscribed=false;
	public Kandydat1(String imie, String nazwisko, String pesel) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.pesel = pesel;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kandydat1 person1=new Kandydat1("Józef", "Imio³o", "543553453");
		System.out.println(person1.toString());
		
	}
	

}
