package report.studentsorting.controller;

import report.studentsorting.model.SinhVienImpl;

public class Main {
	public static void main(String[] args) {
		SinhVienImpl SinhVienImpl = new SinhVienImpl();

		SinhVienImpl.readData();
		SinhVienImpl.displaySinhVien();

		SinhVienImpl.sortSinhVienByName();
		SinhVienImpl.displaySinhVien();
		SinhVienImpl.sortSinhVienByAge();
		SinhVienImpl.displaySinhVien();
		SinhVienImpl.sortSinhVienByHometown();
		SinhVienImpl.displaySinhVien();
		SinhVienImpl.topMByScore();

		
	}
}
