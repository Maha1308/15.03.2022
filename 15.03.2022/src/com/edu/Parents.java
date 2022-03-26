package com.edu;

import java.util.Scanner;

public class Parents {
	private  int sal;
	public String name;
	protected int age;
	int accno;

public void input() {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the age");
		age=sc.nextInt();
		System.out.println("enter salary");
		sal=sc.nextInt();
		System.out.println("enter the account");
		accno=sc.nextInt();
		System.out.println("enter the name");
		name=sc.next();
		

	}
void printSal()
{
	System.out.println("Salary="+sal);
}
}
