class Test 
{
	public static void write()
	{
		System.out.println("write the test");
	}
	public void read()
	{
        System.out.println("read the paper");
	}
    class Sample
    {
    public static void main(String[] args) 
	{
		Test.write();
		
		Test rv=new Test();
		rv.read();
	
	
	}
}
	

