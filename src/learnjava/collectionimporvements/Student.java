package learnjava.collectionimporvements;

public class Student {
	
	private int rollNo;
	
	private int marks;
	
	public Student(int rollNo,int marks){
		this.rollNo = rollNo;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
