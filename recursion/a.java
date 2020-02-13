class abc
{
int f=1;
void fact(int a)
	{
		if(a>=2)
	{
		f=f*a;
		fact(a-1);
	}
	}
	public static void main(String arg[])
		{
		abc x=new abc();
		x.fact(6);
		System.out.println(x.f);
		}
		}	