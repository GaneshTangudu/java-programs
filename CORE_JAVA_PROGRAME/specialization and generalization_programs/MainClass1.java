class Student 
{
	public String name;
	public Student(String name)
	{
		this.name=name;
	}
	public void study()
	{
		System.out.println(name+" "+"study english");
	}
	public void write()
	{
		System.out.println(name+" "+"write topic");
	}
	public void prepare()
	{
		System.out.println(name+" "+"prepare for interview");
	}
}
//program with repitation
class  MainClass1
{
    public static void main(String[] args) 
	{
		Student s1=new Student("ganesh");
		Student s2=new Student("rama surya");
		Student s3=new Student("aditya");
		s1.study();
		s1.write();
		s1.prepare();
		s2.study();
		s2.write();
		s2.prepare();
		s3.study();
		s3.write();
		s3.prepare();
	}
}
//*program with specialization to avoid repitative code*//
class MainClass2
{
	public static void result(Student s1)
	{
		s1.study();
		s1.write();
		s1.prepare();
	}
	public static void main(String[] args)
	{
		result(new Student("ganesh"));
		result(new Student("rama surya"));
		result(new Student("aditya"));
	}
}


	
	

