package TestCase;


import org.testng.annotations.Test;


public class HomeLoans extends BaseClass {
	
	
	  


		
		@Test (groups= {"sanity","pay"})
		public void test1() {
			
			System.out.println("Inside home loan test 1");
		}
		
		@Test (priority = 0)
		public void test2() {
			System.out.println("Inside home loan test 2");
		}

	
      
       
       
}
