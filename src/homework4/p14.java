package homework4;

public class p14 {

	public static void main(String[] args)
	{
		RacingCar14 rccar1 = new RacingCar14();
		
		rccar1.setCar(1234, 20.5);
		rccar1.show();
	}
	
}
class Car14
{
	protected int num;
	protected double gas;
	
	public Car14()
	{
		num= 0;
		gas= 0.0;
		System.out.println("車子出來了");
	}
	
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為:"+ this.num +"，汽油量設為"+ this.gas);
	}
	
	public void show()
	{
		System.out.println("車號是:"+this.num);
		System.out.println("汽油量是:"+this.gas);
	}
}
class RacingCar14 extends Car14
{
	private int course;
	
	public RacingCar14()
	{
		course  = 0;
		System.out.println("賽車你看出來了");
	}
	
	public void setCourse(int c)
	{
		course = c;
		System.out.println("將賽車號號碼設為:"+this.course);
	}
	public void show()
	{
		System.out.println("車號是:"+this.num);
		System.out.println("汽油量是:"+this.gas);
		System.out.println("賽車號號碼是:"+this.course);
	}
}