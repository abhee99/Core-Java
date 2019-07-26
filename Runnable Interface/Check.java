class A extends Thread
{
public void run ()
{
for (int i=0;i<5;++i)
System.out.println ("A " + Thread.currentThread().getPriority() );
}
}

class B extends Thread
{
public void run ()
{
for (int i=0;i<5;++i)
System.out.println ("B " + Thread.currentThread().getPriority());
}
}



class Check
{
public static void main (String []p)
{
A a = new A();
B b = new B();
a.setPriority (10);
a.start();
b.start();
}
}
