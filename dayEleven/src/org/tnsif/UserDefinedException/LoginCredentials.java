package org.tnsif.UserDefinedException;

//program to demonstarte the user defined exception
public class LoginCredentials extends Exception{
	//private data member
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	//parameterized constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}
	
	@Override
	public String toString()
	{
		return"LoginCredentials [str=" + str +" ]";
	}

	
	

}
