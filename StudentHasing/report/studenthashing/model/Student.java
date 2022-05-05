package report.studenthashing.model;

import java.util.List;
import java.util.Objects;

import report.studenthasing.library.Date;

public class Student {
	private String firstName;
	private String lastName;
	private Double GPA;
	private String hometown;
	private List<Subject> subjects;
	
	public Student() {
	}
	
	public Student(String studentLine) {
		String[] line = studentLine.split(",");
		
		rollNo = line[0];
		firstName = line[1];
		lastName = line[2];
		
	}
	
	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDoB() {
		return DoB;
	}

	public void setDoB(Date doB) {
		DoB = doB;
	}

	public Double getGPA() {
		return GPA;
	}

	public void setGPA(Double gPA) {
		GPA = gPA;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public int hashCode() {
		int hash = 1;
		hash = 31 * hash + firstName.hashCode();
		hash = 31 * hash + lastName.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Student other = (Student) obj;
				&& Objects.equals(lastName, other.lastName);
	}

//	@Override
//	public String toString() {
//		return "Student [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", DoB=" + DoB
//				+ ", GPA=" + (double) (Math.round(GPA*100.0)/100.0) + ", hometown=" + hometown + ", subjects=" + subjects.toString() + "]";
//	}
	
	public void display() {
		printf("\n%-5s %-20s %-20s %-15s %-10.2f %-20s ",rollNo, firstName, lastName, DoB, GPA, hometown);
	}
}
