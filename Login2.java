import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Login2 extends JFrame implements ActionListener
{
JLabel type;
JComboBox t;
JPasswordField t1;
JRadioButton r1,r2;
JButton b,b1;
	public void actionPerformed(ActionEvent ae)
	{
	if(ae.getSource()==b)
	{ 
		String user,pass,utype="";
		user=t.getSelectedItem().toString();
		pass=t1.getText();
		if(r1.isSelected()==true)
		{
			utype="Admin";
			if(utype.equals("Admin") && user.equals("abc") && pass.equals("123"))
			{
			JOptionPane.showMessageDialog(null,"Login Successfully..");
			}
			else
			{
			JOptionPane.showMessageDialog(null,"invalid user");
			}
		}
		else if(r2.isSelected()==true)
		{
			utype="User";
			if(utype.equals("User") && user.equals("xyz") && pass.equals("456"))
			{
			JOptionPane.showMessageDialog(null,"Login Successfully..");
			}
			else
			{
			JOptionPane.showMessageDialog(null,"invalid user");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Please Select user type ");
		}
		
	}
	else if(ae.getSource()==b1)
	{
		//this.dispose();
		setVisible(false);
	}	
			
	}
	Login2()
	{
		setLayout(null);
		
		JPanel p=new JPanel();
		p.setBounds(20,20,400,400);
		add(p);
		p.setLayout(null);
		p.setBackground(Color.RED);

		//getContentPane().setBackground();

		type=new JLabel("UserType: ");
		type.setBounds(100,50,100,20);
		p.add(type);

		 r1=new JRadioButton("Admin");
		r1.setBounds(200,50,80,20);
		p.add(r1);
		r1.setOpaque(false);		
		
		 r2=new JRadioButton("User");
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

		 t=new JComboBox();
		t.addItem("abc");
		t.addItem("xyz");
		t.setBounds(200,100,100,20);
		p.add(t);
		
	
		 t1=new JPasswordField();
		t1.setBounds(200,150,100,20);
		p.add(t1);

		JCheckBox c1=new JCheckBox("Keep me Logged in");
		c1.setBounds(100,200,200,20);
		p.add(c1);
		c1.setOpaque(false);

		 b=new JButton("Ok");
		b.setBounds(100,250,80,20);
		p.add(b);
		b.addActionListener(this);
		
		 b1=new JButton("Cancel");
		b1.setBounds(200,250,80,20);
		p.add(b1);
		b1.addActionListener(this);

		JLabel back=new JLabel(new ImageIcon("hos.jpg"));
		back.setBounds(0,0,400,400);
		add(back);

		setSize(600,600);
		setVisible(true);
	}
	public static void main(String ar[])
	{
		Login2 log=new Login2();
		
	}	
}