import javax.swing.*;
class Calender extends JFrame
{
        Calender()
        {
	setLayout(null);
	JLabel l=new JLabel("Day");
        l.setBounds(125,100,100,20);
        add(l);	//if we use objects then use object let j.add
        JComboBox c=new JComboBox();
        for(int i=1;i<=31;i++)
        {
          c.addItem(i);
	}
	c.setBounds(100,120,100,20);	
	add(c);
	JLabel l1=new JLabel("Month");
        l1.setBounds(275,100,100,20);
	add(l1);
	JComboBox c1=new JComboBox();
        c1.addItem("January");
	c1.addItem("Febraury");
	c1.addItem("March");
	c1.addItem("April");
	c1.addItem("May");
	c1.addItem("June");
	c1.addItem("July");
	c1.addItem("August");
	c1.addItem("September");
	c1.addItem("October");
	c1.addItem("November");
	c1.addItem("December");
	c1.setBounds(250,120,100,20);
        add(c1);
	JLabel l2=new JLabel("Year");
        l2.setBounds(425,100,100,20);
        add(l2);
        JComboBox c2=new JComboBox();
        for(int i=1920;i<=2050;i++)
        {
          c2.addItem(i);
	}
        c2.setBounds(400,120,100,20);
        add(c2);
	setSize(600,600);
	setVisible(true);
	}
	 public static void main(String arg[])
	 {
 		Calender l=new Calender();  //contructors can call without objects
         }
}