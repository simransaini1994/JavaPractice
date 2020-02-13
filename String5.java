class string5
{
	public static void main(String arg[])
	{
		String s= "i am in java class";
		String s1="";
		String s2="";
		String s3="";
		int len=s.length();
		for(int i=0;i<len;i++)
			{
				s1=s1+s.charAt(i);
				s1=s1.trim();
			}
		System.out.println(s1);
		for(int i=0;i<len;i++)
			{
				if(i%2==0)
				{
					s2=s2+s1.charAt(i);
					s2.toUpperCase();
				}
				else
				{
					s3=s3+s1.charAt(i);
					s3.toLowerCase();
				}
			}
		System.out.println(s2+s3);
		
	}

}