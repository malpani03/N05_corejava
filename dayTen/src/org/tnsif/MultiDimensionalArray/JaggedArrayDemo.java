package org.tnsif.MultiDimensionalArray;

import java.util.*;
//program to demonstrate on jagged array
public class JaggedArrayDemo {

	public static void main(String[] args) {
		/*in jagged array outside array size is fixed
		 * but inside array size is different for different 
		 * outside array index
		 */
		Scanner sc=new Scanner(System.in);
		//jagged array declaration
		int arr[][]=new int[2][];
		//for outside array index 0,storing 3 elements
		arr[0]=new int[3];
		//for outside array index 1,storing 2 elements
		arr[1]=new int[2];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
			
		}
		//for printing an array
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
