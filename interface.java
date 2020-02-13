interface abc //object can be created by using anonymous class//
{
      void show();
      void display();
}
class xyz
{
	public static void main(String ar[])
	{
		abc x=new abc()
		{
			public void show()
			{
				System.out.println("hello");
			}
			public void display()
			{
				System.out.println("hi");
			}
		};
		x.show();
		x.display();
	}
}