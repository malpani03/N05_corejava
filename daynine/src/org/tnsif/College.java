package org.tnsif;

public class College implements Students,Staff{

	@Override
	public void showName() {
		System.out.println(Staffname+" "+Department+" "+name);
		
	}


}
