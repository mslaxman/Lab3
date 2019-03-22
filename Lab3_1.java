package com;

import java.util.Scanner;

public class Lab3_1 {
	public int secondSmallest(int[] a ) 
   	{ 
       
		int i,j,temp;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a[1];
   	}
	public static void main(String st[]) {
		Scanner s=new Scanner(System.in);
		int a[]= {1,2,3,4,5};
		Lab3_1 e=new Lab3_1();
		System.out.print(e.secondSmallest(a));
	}
}
