package report.studentsorting.model;

import java.util.Comparator;

import report.studentsorting.library.Date;

public class SinhVien implements Comparable<SinhVien> {
	private String ten;
	private String hoDem;
	private Float diemTBC;
	private Date ngayThangNamSinh;

	public SinhVien() {
	}

	public SinhVien(String ten, String hoDem, String maSinhVien, Float diemTBC, Date ngayThangNamSinh, String queQuan) {
		super();
		this.ten = ten;
		this.hoDem = hoDem;
		this.maSinhVien = maSinhVien;
		this.ngayThangNamSinh = ngayThangNamSinh;
		this.queQuan = queQuan;
	}

	public SinhVien(String sinhVien) {
//		System.out.println(sinhVien);
		String[] a = sinhVien.split("\\s+");
		hoDem = a[1];
		maSinhVien = a[2];
		diemTBC = Float.parseFloat(a[3]);
		ngayThangNamSinh = new Date(a[4]);
//	     for(String x : a) {
//	    	 System.out.print(x +"  ");
//	     }
//	     System.out.println();

	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getHoDem() {
		return hoDem;
	}

	public void setHoDem(String hoDem) {
		this.hoDem = hoDem;
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public Float getDiemTBC() {
		return diemTBC;
	}

	public void setDiemTBC(Float diemTBC) {
		this.diemTBC = diemTBC;
	}

	public Date getNgayThangNamSinh() {
		return ngayThangNamSinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	@Override
	public String toString() {
		return "SinhVien [ten=" + ten + ", hoDem=" + hoDem + ", maSinhVien=" + maSinhVien + ", diemTBC=" + diemTBC
	}

	@Override
		if (sv.diemTBC.equals(this.diemTBC)) {
		}
		return this.diemTBC.compareTo(sv.diemTBC);
	}

	public static class Age implements Comparator<SinhVien> {
		@Override
			return a.ngayThangNamSinh.compareTo(b.ngayThangNamSinh);
		}
	}
	//so sanh que quan roi den ten
	public static class Hometown implements Comparator<SinhVien> {
		@Override
		public int compare(SinhVien a, SinhVien b) {
				return a.ten.compareTo(b.ten);
			} else {
				return a.queQuan.compareTo(b.queQuan);
			}
		}
	}
	//so sanh ten roi den ho dem
	public static class Name implements Comparator<SinhVien> {
		@Override
		public int compare(SinhVien a, SinhVien b) {
				return a.hoDem.compareTo(b.hoDem);
				return a.ten.compareTo(b.ten);
			}
		}
	}
}
