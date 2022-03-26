
package constructor;




class parent
{
	private int sal;
	public parent()
	{
		System.out.println("parent class constructor");
	}
	public parent(int sal)
	{
		this.sal=sal;
		System.out.println("salary="+sal);
	}
}
class Child extends parent
{
	public Child()
	{
		System.out.println("child class constructor");
	}
	public Child(int sal)
	{
		super(sal);
		System.out.println("any statement");
	}
}

public class Maincons {

	public static void main(String[] args) {
	Child ob1=new Child();
	Child ob2=new Child(23094);
	}

}
