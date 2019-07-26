import javax.swing.*;
import java.awt.event.*;

public class cal extends JFrame
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2;
	JButton b1;
	
	
	public cal(String s)
	{
		super(s);
	}
	
	public void setComponent()
	{
		l1=new JLabel("Addition Of Two Numbers");
		l2=new JLabel("First Number");
		l3=new JLabel("Second Number");
		l4=new JLabel();
		t1=new JTextField();
		t2=new JTextField();
		b1=new JButton("Add");
		setLayout(null);
		
		l1.setBounds(75,30,200,20);
		l2.setBounds(30,80,100,20);
		t1.setBounds(150,80,100,20);
		l3.setBounds(30,130,100,20);
		t2.setBounds(150,130,100,20);
		b1.setBounds(110,180,60,20);
		l4.setBounds(30,230,270,20);
		b1.addActionListener(new Handler());
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(b1);
		add(l4);
	}
	class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int s=a+b;
			l4.setText("Result = "+s);
		}
	}
	public static void main(String arg[])
	{
		cal jf=new cal("Calculator");
		jf.setComponent();	
        jf.setSize(300,300);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}