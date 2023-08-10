package org.tnsif.CheckedExceptions;

import java.io.*;
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
		FileInputStream f=new FileInputStream("D:\\TNS note.txt");
		System.out.println("File has found");
		}
		catch(FileNotFoundException e){
			System.out.println("File does not exist" +e);
		}
	
	}

	}


