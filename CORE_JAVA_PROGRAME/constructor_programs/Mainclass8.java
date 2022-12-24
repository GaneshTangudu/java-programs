class Student
{
	public String name;
	public int age;
	public double tenth;
	public double inter;
	public double degree;
	public double masters;
    public Student(String name,int age,double tenth,double inter,double degree,double masters)
	{
		this.name=name;
		this.age=age;
		this.tenth=tenth;
		this.inter=inter;
		this.degree=degree;
		this.masters=masters;
	}
	public Student(String name,int age,double tenth,double inter,double degree)
	{
		this.name=name;
		this.age=age;
		this.tenth=tenth;
		this.inter=inter;
		this.degree=degree;
	}
	public void details()
	{
		System.out.println("*******");
		System.out.println("name:"+name);
		System.out.println("age:"+age+"years");
		System.out.println("tenth:"+tenth+"%");
		System.out.println("inter:"+inter+"%");
		System.out.println("degree:"+degree+"%");
		if(masters!=0.0)
		{
		System.out.println("masters:"+masters+"%");
		}
	}
}
class Mainclass8
{
	public static void main(String[] args)
	{
		Student student1=new Student("karan",24,6.2,71.44,84.21,81.2);
		Student student2=new Student("chand",24,7.5,86.44,90.22,71.21);
		Student student3=new Student("santhosh kumar",31,96.88,78.91,68.92,76.91);
		Student student4=new Student("ganesh",21,8.5,68.44,6.8);
		student1.details();
		student2.details();
		student3.details();
		student4.details();
	}
}



		
	
		
		

	

