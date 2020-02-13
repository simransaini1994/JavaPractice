class xyz
{
	xyz()
	{
		System.out.println("hello java");
	}
	public static void main(String arg[])
		{	int a=0;
			xyz x=new xyz(); 
			a++;
			xyz y=new xyz();
			a++;
			xyz z=new xyz(); 
			a++;
			System.out.println(a);
		}
}