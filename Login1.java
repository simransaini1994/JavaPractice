import javax.swing.*;
import java.awt.*;
class Login1 extends JFrame
{
	Login1()
	{
		setLayout(null);
		
		
		getContentPane().setBackground(new Color(117,193,255));

		JLabel type=new JLabel("UserType: ");
		type.setBounds(100,50,100,20);
		add(type);

		JRadioButton r1=new JRadioButton("Admin");
		r1.setBounds(200,50,80,20);
		add(r1);
		r1.setOpaque(false);		
		
		JRadioButton r2=new JRadioButton("User");
		r2.setBounds(280,50,80,20);
		add(r2);
		r2.setOpaque(false);

		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);

		JLabel l=new JLabel("Username: ");
		l.setBounds(100,100,100,20);
		add(l);

		JLabel l1=new JLabel("Password: ");
		l1.setBounds(100,150,100,20);
		add(l1);

		JComboBox t=new JComboBox();
		t.addItem("Abc");
		t.addItem("xyz");
		t.addItem("mno");
		t.addItem("123");	
		t.setBounds(200,100,100,20);
		add(t);
		
	
		JPasswordField t1=new JPasswordField();
		t1.setBounds(200,150,100,20);
		add(t1);

		JCheckBox c1=new JCheckBox("Keep me Logged in");
		c1.setBounds(100,200,200,20);
		add(c1);
		c1.setOpaque(false);
		JButton b=new JButton("Ok");
		b.setBounds(150,250,100,20);
		add(b);

		setSize(400,400);
		setVisible(true);
	}
	public static void main(String ar[])
	{
		Login l=new Login();
		
	}	
}