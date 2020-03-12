class Example 
{

	static void m1(){
		System.out.println("Example m1");
	}

    void m2(){
		System.out.println("Example m2");
	}
   
   void m3(){
		System.out.println("Example m3");
	}


	void m4(int x){
		System.out.println("Example m4");
	}
}


class Sample extends Example
{
	static void m1(){
		System.out.println("sample m1");
		Example.m1();
	}

     void m2(){
		System.out.println("sample m2");
		super.m2();
	}

	void m4(String s){
		System.out.println("sample m3(int-param)");
	}


	public static void main(String[] args) 
	{
		Sample s=new Sample();
		//s.m1();
		s.m2();
		//s.m3();
		//s.m4();
		//s.m4("kkkk");

		Example e=new Sample();
		//e.m1();
		//e.m2();
		//e.m3();
		//e.m4(30);
		//e.m4("hk");
	}
}
