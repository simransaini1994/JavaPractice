package com.practice;
abstract class vehiclemain
{
	public final int s=100;
	public abstract void applyBrake();
	}
class vehicle
{
	public void applyBrake(){
		System.out.println("vehicle brake applied");
	}
	public void applyBrake2()
	{
		System.out.println("Bike2 brake applied");
	}
}
class Bike extends vehiclemain
{
	public void applyBrake()
	{
		System.out.println("Bike brake applied"+s);
	}

	}
public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bike b=new Bike();
        b.applyBrake();
	}

}
