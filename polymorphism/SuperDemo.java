class SuperClass
{
	SuperClass(){
		this(10);
       System.out.println("super class no arg");
	}

  SuperClass(int a){
		this("abc");
       System.out.println("super class int-arg");
	}
  
  SuperClass(String s){
		
       System.out.println("super class String arg");
	}
}



class SubClass extends SuperClass
{ 
    SubClass()
	{
		this(10);
		System.out.println("subclass no arg");

	}


	SubClass(int a){
		this("abc");
       System.out.println("subclass int-arg");
	}
  

  SubClass(String str){
		
       System.out.println("subclass String-arg");
	}
}

  
  class SuperDemo
  {
 

	public static void main(String[] args) 
	{   

		//new SubClass();
		System.out.println();
        
		//new SubClass(10);
		new SubClass("abc");
	}
}
