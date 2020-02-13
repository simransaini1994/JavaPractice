import javax.swing.*;
import java.awt.*;
class Login4 extends JFrame
{
	Login4()
	{
		setLayout(null);
		
		JPanel p=new JPanel();
		p.setBounds(100,200,500,500);
		add(p);
		p.setLayout(null);
		p.setBackground(Color.RED);

		//getContentPane().setBackground();

		JLabel type=new JLabel("UserType: ");
		type.setBounds(100,50,100,20);
		p.add(type);

		JRadioButton r1=new JRadioButton("Admin");
		r1.setBounds(200,50,80,20);
		p.add(r1);
		r1.setOpaque(false);		
		
		JRadioButton r2=new JRadioButton("User");
		r2.setBounds(280,50,80,20);
		p.add(r2);
		r2.setOpaque(false);

		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);

		JLabel l=new JLabel("Username: ");
		l.setBounds(100,100,100,20);
		p.add(l);

		JLabel l1=new JLabel("Password: ");
		l1.setBounds(100,150,100,20);
		p.add(l1);

		JComboBox t=new JComboBox();
		t.addItem("Abc");
		t.addItem("xyz");
		t.addItem("mno");
		t.addItem("123");	
		t.setBounds(200,100,100,20);
		p.add(t);
		
	
		JPasswordField t1=new JPasswordField();
		t1.setBounds(200,150,100,20);
		p.add(t1);

		JCheckBox c1=new JCheckBox("Keep me Logged in");
		c1.setBounds(100,200,200,20);
		p.add(c1);
		c1.setOpaque(false);

		JButton b=new JButton("Ok");
		b.setBounds(150,250,100,20);
		p.add(b);

		JLabel back=new JLabel(new ImageIcon("hos.jpg"));
		back.setBounds(0,0,400,400);
		add(back);

		setSize(400,400);
		setVisible(true);
	}
	public static void main(String ar[])
	{
		Login4 log=new Login4();
		
	}	
}