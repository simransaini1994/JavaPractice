class Add
{ int x,z;
  void get_data()
   { x=10;
     z=30;

   }
  void sum()
  { int sum=x+z;
   System.out.println("SUM:"+sum);
  }
  public static void main(String arg[])
   { Add obj= new Add();
      obj.get_data();
      obj.sum();

   }
}