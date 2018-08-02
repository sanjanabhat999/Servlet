package com.deloitte;

public class Largest1 {
	public Integer[] getLargest(int no1, int no2)
	{   

		Integer x[]= new Integer[2];
		if(no1>no2)
		{
			x[0]=no1;
			x[1]=no2;
		}
		else
		{
			x[0]=no2;
			x[1]=no1;
		}
		return x;
	}
	

}
