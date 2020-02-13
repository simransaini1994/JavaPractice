import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Member
{
 int member_id;
 String member_name;
 String address;
 int contactno;
class Book
{
int book_id;
String book_name;
String publisher;
String author;
}
class Library
{
book bookcollection()
{
Book book[]=new Book[3];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
for(i=0;i<book.length;i++)
{
System.out.println("enter book id")
int book_id=Integer.parseInt(br.readLine());
 System.out.println("enter book name");
  String book_name=br.readLine();
  System.out.println("publisher name");
 String publisher=br.readLine();
 System.out.println("author");
 String author=br.readLine();
 book[i]=new Book();
}
return(book);
 

}class Transaction
{
int transaction_id;
int book_id;
int member_id;
double issue_date;
double return_date;
double transaction_date;

public static void main String(arg[])throws exception IO
 {
   /*Member m[]=new Member[3];
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 for(int i=0;i<m.length;i++)
 {
  int m=Integer.parseInt(br.readLine()); 
  String n=br.readLine();
  String a=br.readLine();
  int c=Integer.parseInt(br.readLine());
  m[i]=new E(m,n,a,c);*/
 Library l=new Library();
 l.bookcollection();
}
  
 
