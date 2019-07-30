import java.util.*;
class A
{
    void fun1()
    {
        
    }
}
class B
{
    A a=new A()  //  Anonymous Class  // Inner class for B    // Child class for A
    {
        void fun1()         // Anonymous class me function override hi kr skte hai only
        {
            System.out.println("Hello");
        }
    };  
}
public class AnonymousExample
{
    public static void main(String arg[])
    {
        B b=new B();
        b.a.fun1(); 
    }
}