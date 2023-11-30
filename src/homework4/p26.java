package homework4;

public class p26 {

	public static void main(String[] args)
	{
		/*Car25 car1 = new Car25();
		Car25 car2 = new Car25();
		
		Car25 car3;
		car3 = car1;
		
		System.out.println("第一台跟第二台一樣"+ car1.equals(car2));
		System.out.println("第一台跟第三台一樣"+ car1.equals(car3));
		*/
		Car26[] cars = new Car26[2];
		cars[0] = new Car26();
		cars[1] = new RacingCar26();
		for(int i = 0; i < cars.length; i++)
		{
			Class cl = cars[i].getClass();
			System.out.println("第"+ (i+1) +"個物件的類別是"+ cl);
		}
	}

}
class Car26
{
	protected int num;
	protected double gas;
	
	public Car26()
	{
		num= 0;
		gas= 0.0;
		System.out.println("車子出來了");
	}
}
class RacingCar26 extends Car26
{
	public RacingCar26()
	{
		System.out.println("賽車你看出來了");
	}
}