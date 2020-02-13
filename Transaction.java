import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Member
{
 int member_id;
 String member_name;
 String address;
 double contactno;
 int books;
 book_id[]=new int[3]
}

class Book
{
int book_id;
String book_name;
String publisher;
String author;
int status=0;
}
class Library
{ 
boolean flag1=false;
boolean flag2=false;
void membercollection()throws IOException
{
Member m[]=new Member[3];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
for(int i=0;i<m.length;i++)
{
System.out.println("enter member id");
int member_id=Integer.parseInt(br.readLine());
 System.out.println("enter member name");
  String member_name=br.readLine();
  System.out.println("adress");
 String adress=br.readLine();
 System.out.println("enter contact no");
 double author=Double.parseDouble(br.readLine());
 m[i]=new Member();
}
void bookcollection()throws IOException
{
Book b[]=new Book[3];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
for(int i=0;i<b.length;i++)
{
System.out.println("enter book id");
int book_id=Integer.parseInt(br.readLine());
 System.out.println("enter book name");
  String book_name=br.readLine();
  System.out.println("publisher name");
 String publisher=br.readLine();
 System.out.println("author");
 String author=br.readLine();
 b[i]=new Book();
}
 }
void Transaction(int mid,int bid)
{
for(int i=0;i<=3;i++)
{
if(member[i].member_id==mid)
{
 	
	for(int j=0;j<=3;j++)
            {
              if(b[j].book_id=bid&&b[j].status==0)
                 {
                   m[i].books++;
                   b[j].status=1;
                   flag1=true;
                  }
            }
       flag2=true;
}
}if(flag1==true)
  System.out.println("book is not exist or already issued");
  if(flag2==true)
   System.out.println("member is not exist");
void display()
{
  for(int i=0;i<3;i++)
{
  System.out.print(m[i]);
  }
}
}
class Transaction
{
int transaction_id;
int book_id;
int member_id;
double issue_date;
double return_date;
double transaction_date;

public static void main(String arg[])throws IOException 
 {
  int mem_id,book_id,trans_id;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 Library l=new Library();
 l.membercollection();
 l.bookcollection();
 do
 {
  System.out.println("enter member id and book id");
  mem_id=Integer.parseInt(br.readLine());
  book_id=Integer.parseInt(br.readLine());
  l.transaction(mem_id,book_id);
  Sytem.out.prinln("do u want to continue?press y or n");
  String c=br.readLine();
while(c.equals("y"));
l.display();
 
}
 }
 
