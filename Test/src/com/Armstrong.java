package com;

public class Armstrong {
	public static void main(String[] args) {
		
	int orig = 407;
	int a = 407;
	int count = 0;
	int add;
	int digits = 3;
	while( a != 0)
	{
		int c = a%10;
		int sqr = c*c*c;
		
		count = count + sqr ;
		a = a/10;
	}
	System.out.println(count);
	if(orig == count)
	{
	System.out.println("Amstrong Number");
	}
	else
	{
		System.out.println("Not Amstrong Number");
	}
	}
}
