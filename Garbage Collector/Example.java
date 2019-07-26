
class A
{
	protected void finalize()
	{
		System.out.println("I AM GC");
	}
}
public class Example
{
	public static void main(String arg[])
	{
		fun();
		System.gc();
		
		//a.finalize();
		//a.finalize();
	}
	static void fun()
	{
		A a=new A();
	}
}