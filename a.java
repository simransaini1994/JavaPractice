class abc
{
	void show()
	{
		System.out.println("hello");
	}
}
class xyz
{
`	static abc m=new abc()
	{
		void show()
		{
		System.out.println("hi");	
		}
	};
public static void main(String arg[])
{
	xyz x=new xyz();
	m.show();
}
}