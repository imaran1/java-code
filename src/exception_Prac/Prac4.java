package exception_Prac;

class SalaryCalculationException extends Exception { }

class Person
{
	public void claculatSalary() throws SalaryCalculationException
	{
		throw new SalaryCalculationException();
	}
}

class Company
{
	public void salary() throws SalaryCalculationException
	{
		new Person().claculatSalary();
	}
}
public class Prac4
{
	public static void main(String[] args) throws SalaryCalculationException 
	{
		new Company().salary();
	}
}
