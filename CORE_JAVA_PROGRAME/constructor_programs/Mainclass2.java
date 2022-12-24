class Car 
{
	public static String carName="Hyundai";
	public String series;
	public int speed;
	public double time;
	public Car(String a,int b,double c )
	{
		series=a;
		speed=b;
		time=c;
	}
	public void evaluate()
	{
		double distance=speed*time;
		System.out.println(carName+"-"+series+" distance travelled by car "+distance+"km");
	}
}

class Mainclass2
{
    public static void main(String[] args) 
	{
		Car c1=new Car("i10",145,1);
		Car c2=new Car("i20",155,1);
		Car c3=new Car("i30",175,1);
		c1.evaluate();
		c2.evaluate();
		c3.evaluate();
		
	}
}
