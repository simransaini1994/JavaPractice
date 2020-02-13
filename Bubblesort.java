import java.util.Scanner;
class Bubblesort
{
 static void sort(int a[]) //non static method can not called from static 
 {
   int temp;
  for(int i=0;i<a.length;i++)
   {
    for(int j=0;j<a.length-1;j++)
     {      
        if(a[j]>a[j+1])  
          {
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
        }
   }
  }
   System.out.println("sorted elements are")
    for(int i=0;i<a.length;i++)
      {
      System.out.println(a[i]);
      }
 }
  public static void main(String arg[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter  elements");
     int a[]=new int[5];
     for(int i=0;i<a.length;i++)
       {
         a[i]=s.nextInt();
       }
     sort(a);
    }
  }
  
