package homework4;

public class p17 {

	public static void main(String[] args)
	{
		Car17 cars[] = new Car17[2];
		
		cars[0] = new Car17();
		cars[0].setCar(1235, 20.44);
		
		cars[0] = new RacingCar17();
		cars[0].setCar(8425, 23.99);
		
		for(int i = 0; i<cars.length; i++)
			cars[i].show();
	}
	
}
class Car17
{
	protected int num;
	protected double gas;
	
	public Car17()
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
class RacingCar17 extends Car17
{
	private int course;
	
	public RacingCar17()
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