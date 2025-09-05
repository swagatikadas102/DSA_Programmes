package Upcasting_Downcasting;

/*public class Test {

	 static void m3(Example e){
	        e.m1();
	        if(e instanceof Sample) {
	        	 Sample s= (Sample)e;
	 	        s.m2();
	        }
	       
	    }
	public static void main(String[] args) {
		
		 Test.m3(new Sample());
	}

}*/

public class Test {
	
	static void m3(Object obj){
		
		if(obj instanceof Example) {
			Example e = (Example)obj;
			e.m1();
			System.out.println("e.m1()");
			System.out.println("Checking for git");
		}
		else if(obj instanceof Sample){
			Sample s = (Sample)obj;
			s.m1();
			System.out.println("s.m1()");
			s.m2();
			System.out.println("s.m1()");
		}
	}
	
	public static void main(String[] args) {
		/* Test.m3(new Example()); */
		
		  Test.m3(new Sample());
			/* Test.m3(new Object()); */
		 
	}
}

class Example {
	   void m1(){
	       System.out.println("m1");
	   }
	}

	class Sample extends Example{
	   void m2(){
	       System.out.println("m2");
	   }
	}