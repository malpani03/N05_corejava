package org.tnsif.jdbc.mvc;

import java.sql.*;
import java.util.*;



import com.mysql.jdbc.Statement;

public class StudentServiceImpl implements IStudentService{

	Connection cn;
	Statement st;
	PreparedStatement pst;
	public StudentServiceImpl() throws SQLException
	{
		cn=DButil.getCn();
		st=(Statement) cn.createStatement();
	}
	@Override
	public void addStudent(Student student) throws SQLException {
		//String sql="";
		//int n=st.executeUpdate(sql);
		pst=cn.prepareStatement("INSERT INTO student VALUES(?,?,?)");
		pst.setInt(1, student.getRollno());
		pst.setString(2,student.getSname());
		pst.setFloat(3,student.getPer());
		int n=pst.executeUpdate();
		System.out.println("Student Added");
		
	}

	@Override
	public List<Student> getAllStudents() throws SQLException  {
		List<Student> studList=new ArrayList();
		ResultSet rs=st.executeQuery("SELECT * FROM student");
		while(rs.next())
	{
			Student st=new Student(rs.getInt(1),rs.getString(2),rs.getFloat(3));
			studList.add(st);
	
	}
		rs.close();
		return studList;
	}

	@Override
	public List<Student> getStudentsByPer(float value) throws SQLException {
		List<Student> studList=new ArrayList<Student>();
		pst=cn.prepareStatement("SELECT * FROM student WHERE percentage>=?");
		pst.setFloat(1, value);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			Student st=new Student(rs.getInt(1),rs.getString(2),rs.getFloat(3));
			studList.add(st);
		}
		pst.close();
		return studList;
	}

	@Override
	public List<Student> getStudentsByStartsWith(String str) throws SQLException {
		List<Student> studList=new ArrayList<Student>();
		pst=cn.prepareStatement("SELECT * FROM student WHERE sname LIKE ?");
		pst.setString(1,str);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			Student st=new Student(rs.getInt(1),rs.getString(2),rs.getFloat(3));
			studList.add(st);
		}
		pst.close();
		
		
		return studList;
	}

	@Override
	public int deleteAllStudents() throws SQLException {
		int no=st.executeUpdate("DELETE FROM student");
		return no;
	}

	@Override
	public int deleteByRollNo(int value) throws SQLException {
		int n=st.executeUpdate("DELETE FROM student WHERE rollno='value'");
		return n;
	}

	@Override
	public int updateStudentPer(float value) throws SQLException {
		pst=cn.prepareStatement("UPDATE student SET percentage=percentage+? WHERE percentage<=?");
		pst.setFloat(1, value);
		pst.setFloat(2,100-value);
		int n=pst.executeUpdate();
		return n;
	}

	@Override
	public int updateStudentPerByRollNo(int rvalue,float pvalue) throws SQLException {
		pst=cn.prepareStatement("UPDATE student SET percentage=? WHERE rollno=?");
		pst.setFloat(1, pvalue);
		pst.setInt(2, rvalue);
		int n=pst.executeUpdate();
		return n;
	}
	@Override
	protected void finalize() throws SQLException
	{
		cn.close();
	}
	
	void display(List<Student>list)
	{
		Iterator<Student>it=list.iterator();
		System.out.println("id\tsname\tpercentage");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	

}
