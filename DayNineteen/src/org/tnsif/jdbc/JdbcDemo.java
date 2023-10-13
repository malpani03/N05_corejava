package org.tnsif.jdbc;
import java.sql.*;

import com.mysql.jdbc.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded SuccessFully....");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
		System.out.println(cn);
		
		//Statement -used for static queries
		Statement stmt =(Statement) cn.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT * FROM student");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
		}
		rs.close();
		
		//Inserting Data
		/*int n=stmt.executeUpdate("INSERT INTO student VALUES(6,'GadhaPrasad',35.00)");
		if(n==1)
		{
			System.out.println("Data Inserted Successfully....");
		}
		else
		{
			System.out.println("Data not Inserted");
		}*/
		
		//Delete Data
		int d=stmt.executeUpdate("DELETE FROM student WHERE sname LIKE 'A%'");
		if(d>=1)
		{
			System.out.println(d+" Data Deleted Successfully....");
		}
		else
		{
			System.out.println("No such data Found");
		}
		
		//update student percentage by 5
				int d1=stmt.executeUpdate("UPDATE student SET percentage=percentage+10 WHERE percentage<95");
				if(d1>=1)
				{
					System.out.println(d1+" Record(s) Updated Successfully....");
				}
				else
				{
					System.out.println("No such data Found");
				}
		cn.close();

	}

}
