package org.tnsif.streamAPI;

public class Student {
	private int Rollno;
	private String Name;
	private float per;
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	public Student(int rollno, String name, float per) {
		super();
		Rollno = rollno;
		Name = name;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [Rollno=" + Rollno + ", Name=" + Name + ", per=" + per + "]";
	}

}
