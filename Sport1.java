package abstract1;

abstract class Sports
{
	abstract void play();
}
class Football extends Sports
{
	void play()
	{
		System.out.println("goal");
	}
}
class BasketBall extends Sports
{
	void play()
	{
		System.out.println("Basket ");
	}
}
class Rugdy extends Sports
{
	void play()
	{
		System.out.println("ruby");
	}
}


public class  Sport1
{
	public static void main(String[] args) 
	{
		Football x = new Football();
		BasketBall y = new BasketBall();
		Rugdy z = new Rugdy();
		x.play();
		y.play();
		z.play();
		
	}

}
