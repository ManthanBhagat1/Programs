package abstract1;

abstract class employee
{
	abstract int calculateSalary();
}
class hr extends employee
{
	int calculateSalary()
	{
		int salary = 35000;
		return salary;
	}
}
class devloper extends employee
{
	int calculateSalary()
	{
		int salary  = 100000;
		return salary;
	}
}
public class employee1
{
	public static void main(String[] args)
	{
		 hr h = new  hr();
		System.out.println("Hr "+h.calculateSalary());
		devloper x = new devloper();
		System.out.println("devloper  "+x.calculateSalary());
	}
}

