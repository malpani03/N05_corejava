package org.tnsif.jdbc.mvc;

import java.sql.SQLException;
import java.util.*;

public class Executor {

	public static void main(String[] args) throws SQLException {
		StudentServiceImpl service=new StudentServiceImpl();
		List<Student>studList=new ArrayList<Student>();
		Student st;
		try {
			
			/*
			 * studList=service.getAllStudents(); service.addStudent(new
			 * Student(1,"Neha",96.23f)); service.addStudent(new Student(2,"Sneha",91.23f));
			 * service.addStudent(new Student(3,"heha",92.23f)); service.addStudent(new
			 * Student(4,"huha",93.23f)); service.addStudent(new Student(5,"haha",70.05f));
			 * System.out.println(studList.isEmpty()?"No Students available"
			 * :"---All Students---\n"+studList);
			 */
			
				studList=service.getAllStudents();
				service.display(studList);
			
			/*
			 * studList=service.getStudentsByPer((float) 75.05);
			 * System.out.println(studList); service.display(studList);
			 * System.out.println("--------------------");
			 * 
			 * studList=service.getStudentsByStartsWith("s%"); System.out.println(studList);
			 * service.display(studList);
			 * 
			 * System.out.println("--------------------");
			 */
			/*
			 * int n=service.deleteAllStudents();
			 * System.out.println(n>0?n+"record(s) deleted SuccessFully":"Empty");
			 */	
			
			/*
			 * int n=service.deleteByRollNo(2); service.display(studList);
			 * System.out.println("--------------------");
			 */
			/*
			 * System.out.println("-----------"); 
			 * int n=service.updateStudentPer(1);
			 * service.display(studList);
			 */	
			
			/*
			 * int n=service.updateStudentPerByRollNo(1,4.52f); service.display(studList);
			 */
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
