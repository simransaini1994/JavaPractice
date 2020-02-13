import javax.swing.*;
import java.awt.*;
class Facebook extends JFrame
{
        Facebook()
	{
	setLayout(null);
 	JPanel p=new JPanel();
	p.setBounds(0,0,1366,85);
        p.setLayout(null);
        Color col=new Color(58,87,149);
        p.setBackground(col);
        add(p);
        JLabel l=new JLabel("facebook");
        l.setBounds(185,30,150,25);
        Font fo=new Font("serif",Font.PLAIN,35);
	l.setFont(fo);
        l.setForeground(Color.WHITE);
        p.add(l);
        JLabel l1=new JLabel("Email or Phone");
        l1.setBounds(785,10,150,25);
	l1.setForeground(Color.WHITE);
	p.add(l1);
 	JTextField t=new JTextField();
	t.setBounds(785,35,150,25);
	p.add(t);
	JLabel l2=new JLabel("Password");
        l2.setBounds(955,10,150,25);
	l2.setForeground(Color.WHITE);
	p.add(l2);
	JPasswordField pa=new JPasswordField();
	pa.setBounds(955,35,150,25);
	p.add(pa);
        JButton b=new JButton("Log in");
	Font fo1=new Font("bold",Font.PLAIN,9);
	b.setFont(fo1);
        b.setForeground(Color.WHITE);
	Color col1=new Color(89,114,167);
        b.setBackground(col1);
	b.setBounds(1120,37,60,21);
	p.add(b);
	JCheckBox c=new JCheckBox("Keep me logged in");
	c.setBounds(780,62,150,20);
	c.setOpaque(false);
	Color col2=new Color(157,172,200);
        c.setForeground(col1);
	p.add(c);
	JLabel l3=new JLabel("Forgotten your password");
        l3.setBounds(955,60,150,25);
	l3.setForeground(col1);
	p.add(l3);
	setSize(1366,768);
        setVisible(true);
	}
	public static void main(String arg[])
	{
		Facebook f=new Facebook();
	}
}
		
