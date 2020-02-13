import java.util.Scanner;
public class RemoveWhiteSpaces
{  
	static void removeWhite(String s) // method to remove spaces
	{  
	String[] character=s.split("\\s+");//splits the string based on whitespaces  
	StringBuffer sb = new StringBuffer(); //string buffer is used to store values of array of words
	for(int i=0;i<character.length;i++)
	{
		sb.append(" "+character[i]);      //appends words from array
	}
	System.out.println(sb.toString().trim()); //remove white space before 1st day
	}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter string");
String s=sc.nextLine();
RemoveWhiteSpaces.removeWhite(s); 

}
}  