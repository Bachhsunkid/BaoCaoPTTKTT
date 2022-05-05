package report.studenthasing.controller;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map.Entry;

import edu.princeton.cs.algs4.In;
import report.studenthashing.model.Student;
import report.studenthashing.model.Subject;
import report.studenthasing.library.ST;

public class CreditRegister {
	public void loadData() {
		creditReg = new Hashtable<Student, ST<String, Integer>>();

		String studentFileName = "student.csv";
		String mathFileName = "math-4.csv";
		String physicFileName = "physic-3.csv";
		String chemistryFileName = "chemistry-3.csv";

		In studentFile = new In(studentFileName);
		In mathFile = new In(mathFileName);
		In physicFile = new In(physicFileName);
		In chemistryFile = new In(chemistryFileName);

		while (studentFile.hasNextLine()) {
			ST<String, Integer> st = new ST<String, Integer>();
			List<Subject> s = new ArrayList<Subject>();

			String studentLine = studentFile.readLine();
			Student student = new Student(studentLine);

			String mathLine = mathFile.readLine();
			math.getSubjectNameAndCredits(mathFileName);
			st.put(math.getSubjectName(), math.getCredits());
			s.add(math);

			Subject physic = new Subject(physicLine);
			physic.getSubjectNameAndCredits(physicFileName);
			st.put(physic.getSubjectName(), physic.getCredits());
			s.add(physic);

			String chemistryLine = chemistryFile.readLine();
			Subject chemistry = new Subject(chemistryLine);
			chemistry.getSubjectNameAndCredits(chemistryFileName);
			st.put(chemistry.getSubjectName(), chemistry.getCredits());
			s.add(chemistry);

			student.setSubjects(s);
			creditReg.put(student, st);
		}
	}

	public void displayStudent() {
		System.out.printf("%-5s %-20s %-20s %-15s %-10s %-30s \n", "MSV", "Ten", "Ho dem", "Ngay sinh", "GPA", "Que quan");
		for (Entry<Student, ST<String, Integer>> e : creditReg.entrySet()) {
			e.getKey().display();
		}
			
	}

	public void displayTranscript() {
		System.out.printf("\n%-5s %-20s %-20s %-15s %-10s %-20s %-10s %-10s %-10s\n", "MSV", "Ten", "Ho dem", "Ngay sinh", "GPA", "Que quan", "Toan", "Ly", "Hoa");
			e.getKey().display();
			for(int i=0;i<e.getKey().getSubjects().size();i++) {
				e.getKey().getSubjects().get(i).display();
		}
	}

	public Hashtable<Student, ST<String, Integer>> getCreditReg() {
		return creditReg;
	}

	public void setCreditReg(Hashtable<Student, ST<String, Integer>> creditReg) {
		this.creditReg = creditReg;
	}

}
