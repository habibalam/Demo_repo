class A 
{
	static void m1()
	{
	   System.out.println("A m1");
	}
   
    void m2()  // if doing overrieding then method should  available in parent class if its not avaible then given compile time error
	{
		System.out.println("A m2");
	}

	static void m3()
	{
		System.out.println("A m3 no param");

	}

   int m3(String s){
	
	System.out.println("A m3 String param");
	return 50;
   }
}

class B extends A
{
	static void m1()
	{
		System.out.println("B m1 ");
	}

	/* void m2()
	{
		System.out.println("B m2 ");
	}*/


	
	 void m3(float f, int x)
	{
		System.out.println("B m3 float int param");
	}
}

 class TestPoly
 {
 
	public static void main(String[] args) 
	{
		B b=new B();
		//b.m1();
		//b.m2();
		//b.m3();
		//b.m3("hhhh");
		//b.m3(45.3,55);
		//b.m3(45.3f,67);
          
		  
        //A a=new B();
	  //a.m1();
	  // a.m2();
	  //a.m3("habib");
	  //a.m3(45.3f,67);// here given error buz m3 parametrise available in B class but here we accessing  from A class refrence variable so compile time error
	  
		
		
		
		//System.out.println("Main method");
	}
}
