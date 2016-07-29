package sum;

public class Sum {
	private int sum = 0;
	private double result = 0;
	public Sum(){}
	private double Factorial(int n)
	{
		//1. Найти факториал числа
		double result = 1;
		for(int i = 1; i <= n; i++)
		{
			result *= i;
		}
		System.out.println("Factrial 100! = " + result);
		return result;
	}
	public void SumFactorial(int factorial)
	{
		this.result = Factorial(factorial);
		//Нахождение суммы	
		while(this.result > 0)
		{
			double del = 0;
			del = this.result % 10.0;
			this.result = this.result / 10.0;
			sum += del;
		}
		System.out.println("Sum 100! = " + sum);//sum = 648
	}
}
