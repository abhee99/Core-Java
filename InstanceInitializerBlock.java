public class InstanceInitializerBlock
{
    int x;
    {                           //Intance initializer Block--can be written in program multiple times, And all block will merge and be place in start of constructor 
        System.out.println("Instance Initializer Block "+x);
        x=5;
    }
    public InstanceInitializerBlock()
    {
        System.out.println("Contructor");
    }
    public static void main(String []arg)
    {
        InstanceInitializerBlock i=new InstanceInitializerBlock();
    }
    
}