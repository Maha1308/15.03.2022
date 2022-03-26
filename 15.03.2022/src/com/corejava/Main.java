package com.corejava;

import java.util.Scanner;

class parent
{
	private int sal;
	public String name;
	protected int age;
	int accno;
	
	

void intput()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the age");
	age=sc.nextInt();
	System.out.println("enter the salary");
	sal=sc.nextInt();
	
	System.out.println("enter the accno");
accno=sc.nextInt();
System.out.println("enter the name");
name=sc.next();

sc.close();
}
void printsal()
{
	System.out.println("salary="+sal);
}
}
class child extends parent
{
	void display()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("account="+accno);
	}
}

public class Main {

	public static void main(String[] args) {
		
		
		child ob=new child();
		ob.intput();
	
		ob.printsal();
		ob.display();
	}

}
