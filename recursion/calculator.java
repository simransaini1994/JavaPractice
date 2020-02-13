import java.util.Scanner;
 class abc
{
float sum;
	void add(float a,float b)
	{
	sum=a+b;
	}
float sub;
	void subt(float a,float b)
	{
	sub=a-b;
	}
float div;
	void divi(float a,float b)
	{
	div=a/b;
	}
float mul;
	void mult(float a,float b)
	{
	mul=a*b;
	}
float mod;
	void modulus(float a,float b)
	{
	mod=a%b;
	}
float per;
	void perc(float a,float b)
	{
	per=a/b*100;
	}

public static void main(String arg[])
		{ Scanner sc=new Scanner(System.in);
                  int y,z,ch=0;
		abc x=new abc();
		System.out.println("PRESS 1 for sum");
		System.out.println("PRESS 2 for subtraction");
		System.out.println("PRESS 3 for division");
		System.out.println("PRESS 4 for multiplication");
		System.out.println("PRESS 5 for modulus");
		System.out.println("PRESS 6 for percentage");
		ch=sc.nextInt();
		System.out.println("ENTER FIRST VALUE:");
                y=sc.nextInt();
                System.out.println("ENTER SECOND VALUE:");
                z=sc.nextInt();
		x.add(y,z);
		x.subt(y,z);
		x.divi(y,z);
		x.mult(y,z);
		x.modulus(y,z);
		x.perc(y,z);
		if(ch==1)
		{
			System.out.println("SUM =" +x.sum);
		}
		else if(ch==2)
		{	
			System.out.println("SUBTRACTION = "+x.sub);
		}
		else if(ch==3)
		{
			System.out.println("DIVISION ="+x.div);
		}
		else if(ch==4)
		{
			System.out.println("MULTIPLICATION ="+x.mul);
		}
		else if(ch==5)
		{
			System.out.println("MODULUS ="+x.mod);
		}
		else if(ch==6)
		{
			System.out.println("PERCENTAGE = "+x.per);
		}
                else
                {
                	System.out.println("NOT VALID!!! SORRY");
                }	
	}
}			