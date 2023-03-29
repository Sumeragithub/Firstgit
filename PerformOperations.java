public class PerformOperations
{
	private static void displayOperations(int num1, int num2)
	{
		int sub=num1-num2;
		int mul=num1*num2;
		int div=num1/num2;

		System.out.println("The Subtraction result: "+sub);
		System.out.println("The Multiplication result: "+mul);
		System.out.println("The Division result: "+div);
	}
	
	public static void main(String args[])
	{
		int num1=42,num2=28;
		displayOperations(num1,num2);		

		
	}
}

