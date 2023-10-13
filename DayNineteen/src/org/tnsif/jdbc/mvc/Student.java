package org.tnsif.jdbc.mvc;

public class Student {
	private int rollno;
	private String sname;
	private Float per;
	
	
	@Override
	public String toString() {
		return rollno+"\t"+sname+"\t"+per;
	}
	public Student(int rollno, String sname, Float per) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.per = per;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Float getPer() {
		return per;
	}
	public void setPer(Float per) {
		this.per = per;
	}

}
