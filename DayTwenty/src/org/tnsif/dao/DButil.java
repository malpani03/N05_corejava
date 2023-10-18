package org.tnsif.dao;
import java.sql.*;
import java.util.*;
import java.io.*;

public class DButil {
	static Connection cn;
	static
	{	
		Properties prop=new Properties();
		try 
		{
			prop.load(new FileInputStream("src/db.properties"));
			Class.forName(prop.getProperty("driver_name"));
			
			//Establish COnnection with the database
			cn=DriverManager.getConnection(prop.getProperty("db_url"),prop.getProperty("username"),prop.getProperty("password"));
			System.out.println(cn);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{	
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		public static Connection getCn()
		{
			return cn;
		}
}
