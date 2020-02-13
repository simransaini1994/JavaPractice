import javax.swing.*;
class Login extends JFrame
{
 Login()
       {	
	setLayout(null);
        JLabel l=new JLabel("Username");
        l.setBounds(100,100,100,20);
	add(l);
        JLabel l1=new JLabel("Password");
        l1.setBounds(100,200,100,20);
        add(l1);
        JTextField t=new JTextField();
        t.setBounds(200,100,100,20);
        add(t);
        JPasswordField p=new JPasswordField();
        p.setBounds(200,200,100,20);
        add(p);
	JButton b=new JButton("login");
	b.setBounds(150,300,100,20);
        add(b);
         setSize(400,400);
	setVisible(true);
	}
	 public static void main(String arg[])
	 {
 		Login l=new Login();  //contructors can call without objects
         }
}