class A15 
{
	private void m1()
	{
		System.out.println("A m1 ..");
	}

       void m3()
	{
		System.out.println("A m3");
		
	}



     void m2()
	{
		System.out.println("A m2");
		m3();
	}

}
 
 class B15 extends A15
 {
      void m1()
	{
		System.out.println("B m1");
		
	}
	  void m3()
	{
		System.out.println("B m3");
		
	}

	public static void main(String[] args) 
	{
		B15 b=new B15();
		//b.m1();
	   // b.m2();

		A15 a=new B15();
		a.m2();

	}
}
