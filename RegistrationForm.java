import javax.swing.*;
class RegistrationForm extends JFrame
{
        RegistrationForm()
        {
	setLayout(null);
	JLabel l=new JLabel("Name");
        l.setBounds(100,100,100,20);
        add(l);	//if we use objects then use object let j.add
        JTextField t=new JTextField();
	t.setBounds(200,100,100,20);;	
	add(t);
	JLabel l1=new JLabel("Last name");
        l1.setBounds(100,150,100,20);
	add(l1);
	JTextField t1=new JTextField();
	t1.setBounds(200,150,100,20);
	add(t1);
        JRadioButton b=new JRadioButton("male");
        b.setBounds(100,200,100,20);
        add(b);
	JRadioButton b1=new JRadioButton("female");
        b1.setBounds(200,200,100,20);
        add(b1);
        JCheckBox c=
	setVisible(true);
	setSize(500,500);
	}
	public static void main(String arg[])
	{
		RegistrationForm r=new RegistrationForm();
	}
}
	
