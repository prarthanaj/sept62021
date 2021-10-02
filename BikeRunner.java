class BikeRunner
{
public static void main(String[] values)
{
	Bike.brake(19);
	boolean value=Bike.start();
	System.out.println(value);
	boolean good=false;
	System.out.println(value==good);
	
	int speed=Bike.currentSpeed();
	if(speed>=60)
	{
		System.out.println("over speed");
	}
}

}