public class StaticInitializerBlock               // can only access static member and run only one when object is created first time
{
    static int x;
    static 
    { 
        System.out.println("Instance Initializer Block "+x);
        x=5;
    }
    public StaticInitializerBlock()
    {
        System.out.println("Contructor");
    }
    public static void main(String []arg)
    {
        StaticInitializerBlock i=new StaticInitializerBlock();
        StaticInitializerBlock i1=new StaticInitializerBlock();
    }
    
}