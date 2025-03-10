package com.wipro.test;

import org.junit.Assert;
import org.junit.Test;

import com.wipro.basic.App;

public class AppTest {
	

	
	    @Test
	    public void testAdd() {
	        App app = new App();
	       Assert.assertEquals(5, app.add(2, 3));
	    }
	


}
