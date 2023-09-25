package org.tnsif.SingleDimensionalArray;
import java.util.*;
//program to demonstrate on run time array and to find the largest element in an array
import java.util.Scanner;
public class arrayMax {

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
				for(int i=0;i<n;i++)
				{
					System.out.print(arr[i]+" ");
				}
				System.out.println();
				int max=arr[0];
				for(int i=0;i<n;i++)
				{
					if(arr[i]>max)
					{
						max=arr[i];
					}
				}
				System.out.println("The Largest value in the array is:"+max);
				
				//Arrays is an class and sort is the inbuilt method
				
				Arrays.sort(arr);
				for(int i=0;i<n;i++)
				{
					System.out.print(arr[i]+" ");
				}
				sc.close();
				
				
	}

}
