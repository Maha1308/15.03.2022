package com.overriding;
class parent
{
	final int acc=555;
	private int sal;
	public parent()
	{
		System.out.println("parent class constructor");
	}
	public parent(int sal)
	{
		this.sal=sal;
		System.out.println("salary"+sal);
		
		
	}
	void display()
	{
		System.out.println("parent display");
	}
	
}
class child extends parent
{
	public child()
	{
		System.out.println("child class constructor");
		
	}
	public child(int sal) {
		super(sal);
		System.out.println("other statement");
		
	}
	void display()
	{
		System.out.println("child display");
		super.display();
	}
}
public class overriding {

	public static void main(String[] args) {
		child ob=new child();
		child ob1=new child(7953902);

	}

}
