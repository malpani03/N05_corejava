package org.tnsif.SingleDimensionalArray;

import java.util.Scanner;

public class ProductArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements in an array:");
		int n=sc.nextInt();
		
		//array declaration
		int arr[]=new int[n];
		//array initialization
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int res[]=new int[n];
		 
		
		for(int i=0;i<n;i++)
		{
			int rs=1;
			for(int j=0;j<4;j++) 
			{
				if(j!=i) {
					rs=rs*arr[j];
			}
		}
			res[i]=rs;
	}
			for(int i=0;i<n;i++)
			{
			System.out.print(res[i]+" ");
			}
	}
}