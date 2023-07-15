package week1.day1;

public class Maths
{
	int add(int a ,int b)//method for addition
	{
		return a+b;
	}
	int mul(int a1 ,int b1)//method for multiplication
	{
		return a1*b1;
	}
	float div(float a3 ,float b3)//method for division
	{
		return a3/b3;
	}
	
	
	public static void main(String[] args)
	{
		int s1=30,s2=2;
		float a1=9.0f,b1=8.9f;
		Maths mat=new Maths();//object creation
		int sum=mat.add(s1,s2);
		int mul=mat.mul(s1,s2);
		float div=mat.div(a1, b1);
		System.out.println("The sum is "+sum);
		System.out.println("The multiplication  is "+mul);
		System.out.println("The division is "+div);

	}

}
