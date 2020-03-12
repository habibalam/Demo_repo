class A
{
	void m1(float f)
    {
		
		System.out.println("A float-args");
    }

};

class B extends A
{
    void m1(int  a)
	{
		System.out.println("B int-args");
	}



};


class Test1
{
    
	public static void main(String[] args) 
	{
		B b=new B();
		
		 /*b.m1(50);
		 b.m1('a');
		 b.m1(50L);*/

		 A a=new B();
		 a.m1(50);
		 a.m1('a');
		 a.m1(50L);

		

	}
}
