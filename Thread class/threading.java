class A extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        System.out.println("Thread A "+i);
    }
}
class B extends Thread
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
        A a=new A();
        B b=new B();
       // Thread t1=new Thread(a);
       // Thread t2=new Thread(b);
        a.start();
        b.start();
    }
}