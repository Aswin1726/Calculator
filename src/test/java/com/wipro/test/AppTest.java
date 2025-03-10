package com.wipro.test;

import org.junit.Assert;
import org.junit.Test;

import com.wipro.basic.App;

public class AppTest {
	
          
	 App app = new App();
	    @Test
	    public void testAdd() {
	       
	      int sum=app.add(2, 3);
	      System.out.println(sum);
	    }
	    @Test 
	    public void testSub()
	    {
	    	int sub=app.sub(2, 3);
	    	System.out.println(sub);
	    	
	    }
	    @Test
	    public void testMult()
	    {
	    	int mul=app.mul(2, 3);
	    	System.out.println(mul);
	    	
	    }


}
