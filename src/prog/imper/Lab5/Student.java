package prog.imper.Lab5;

public class Student extends Person1 {
	


	protected String indexNo;
	public Student(String firstName, String lastName, String pesel) {
		super(firstName, lastName, pesel);
		
	}

	private static final long serialVersionUID = 1L;
	public String getIndexNo() {
		return indexNo;
	}



	public void setIndexNo(String indexNo) {
		this.indexNo = indexNo;
	}



}
