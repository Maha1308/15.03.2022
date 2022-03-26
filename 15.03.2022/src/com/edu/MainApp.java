package com.edu;


class child extends Parents{
	void display()
	{
		
		System.out.println("Name="+name);
		System.out.println("age="+age);
	}
}





public class MainApp {

	public static void main(String[] args) {
		
		child ob=new child();
		ob.input();
		ob. display();
		Parents ob1=new Parents();
		System.out.println("Name="+ob1.name);
		
		
		
		
	}

}
