package org.tnsif.lambdaExpression;

public class Executor {

	public static void main(String[] args) {
		Cube c=(no)->no*no*no;
		System.out.println(c.getCube(4));
		
		Operations obj;
		
		obj=(a,b)->{return a+b;};
	    System.out.println(obj.performArithmetic(10,20));

	    obj=(a,b)->a-b;
	    System.out.println(obj.performArithmetic(10,20));
	    
	    obj=(a,b)->a*b;
	    System.out.println(obj.performArithmetic(10,20));
	    
	    obj=(a,b)->a/b;
	    System.out.println(obj.performArithmetic(10,20));

	    
	}

}
