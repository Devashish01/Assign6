class A
{
	void print()
	{
		System.out.println("no argumnets");
	}
	void print(int a)
	{
		System.out.println("int argument "+a);
	}
	void print(float a)
	{
		System.out.println("float argument "+a);
	}
}


public class Overload {

	public static void main(String[] args) {
		A obj=new A();
		int b=10;
		float c=1.0f;
		obj.print();
		obj.print(b);
		obj.print(c);

	}

}
