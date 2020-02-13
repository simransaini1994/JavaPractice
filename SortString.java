import java.util.*;

public class SortString
{
  
  public static void main(String[] args)
  { Scanner sc=new Scanner(System.in);
    String students[];
    // create a Java String array
      System.out.println("Enter number of students to be entered");
       int a=sc.nextInt();
    students= new String[a+1]; // 1stly null string is stored in 
      for(int i=0;i<a+1;i++) 
	{
		students[i]=sc.nextLine();
	}
    
    // sort the array, using the sort method of the Arrays class
    Arrays.sort(students);
    
    // print the sorted results
 System.out.println("sorted students: ");
    for (String student:students)
      {
      System.out.println(student);
      }
  }
}