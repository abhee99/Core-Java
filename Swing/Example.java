import javax.swing.*;

//public class Example
//{
//	public static void main(String arg[])
//	{
//		JFrame jf=new JFrame();
//		jf.setSize(300,300);                                                  //CREATING JFRAME BY CREATING ITS OBJECT
//		jf.setVisible(true);
//		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
//}

public class Example extends JFrame
{
	public Example(String s)
	{
		super(s);
	}
	
	public static void main(String arg[])
	{
		Example e=new Example("MY GUI");                                       //CREATING JFRAME BY CREATING CHILD CLASS
        e.setSize(500,500);
		e.setVisible(true);
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}