public class StringMethods
{
	public static void main(String arg[])
	{
		String s1 = "HELLO";
		String s2 = "HELLO";
		
		if(s1.equals(s2))
		{
	
			System.out.println("BOth String are same.");

		}
		else{
				
			System.out.println("BOth String are not same.");

		}
		
		if(s1.equalsIgnoreCase(s2))
		{
	
			System.out.println("BOth String are same but case insensitive.");

		}
		else{
				
			System.out.println("BOth String are not same and case insensitive.");

		}

	
	}

}