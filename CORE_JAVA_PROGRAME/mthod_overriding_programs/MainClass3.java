class Employee 
{
	public int id;
	public String name;
	public double salary;
	public Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void details()
	{
			System.out.println("id:"+id);
			System.out.println("name:"+name);
			System.out.println("salary:"+salary);
	}
}
class Developer extends Employee
{
	public String language;
	public Developer(int id,String name,double salary,String language)
	{
		super(id,name,salary);
		this.language=language;
	}
	public void developer()
	{
		details();
		System.out.println("language:"+language);
	}
}
class Hr extends Employee
{
	public String specialization;
	public Hr(int id,String name,double salary,String specialization)
	{
		super(id,name,salary);
		this.specialization=specialization;
	}
	public void hr()
	{
		details();
		System.out.println("specialization:"+specialization);
	}
}
class MainClass3
{
	public static void main(String[] args)
	{
		Developer d1=new Developer(23467,"ganesh",3.5,"java");
		d1.developer();
		Developer d2=new Developer(34567,"teju",4.6,"html");
		d2.developer();
		System.out.println("*************************************************************");
		Hr h1=new Hr(45467,"ashok",5.5,"recruitment Hr");
		h1.hr();
		Hr h2=new Hr(56567,"mahesh",8.7,"employee Hr");
		h2.hr();
	}
}
