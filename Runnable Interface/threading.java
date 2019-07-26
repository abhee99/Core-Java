class A implements Runnable
{
    public void run()
    {
		
        for(int i=0;i<=10;i++)
        System.out.println("Thread A "+i);
	
    }
}
class B implements Runnable
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        System.out.println("Thread B "+i);
    }
}
public class threading
{
    public static void main(String args[])
    {
        Runnable a=new A();
        Runnable b=new B();
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
		t1.setPriority(10);
		t2.setPriority(1);
        t1.start();
        t2.start();
    }
}