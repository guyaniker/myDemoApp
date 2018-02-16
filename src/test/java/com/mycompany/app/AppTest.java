package com.mycompany.app;
/*
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.Arrays;
import junit.framework.TestCase;

class AppTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	public void arrayIsEmpty() {
	      ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	      Integer [] arr= {};
	      Assert.assertFalse(new App().app(arr,arrayList,4,4));
	    }
	public void arrayListIsEmpty() {
	      ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList());
	      Integer [] arr= {1,2,3,4};
	      Assert.assertFalse(new App().app(arr,arrayList,4,4));
	    }
	public void firstIntegerZeroOrlessThanZero() {
	      ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	      Integer [] arr= {1,2,3,4};
	      Assert.assertFalse(new App().app(null,arrayList,0,4));
	    }
	public void SecondIntegerZeroOrlessThanZero() {
	      ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	      Integer [] arr= {1,2,3,4};
	      Assert.assertFalse(new App().app(null,arrayList,4,0));
	    }
	public void differentSizeArrayAndArrayList() {
	      ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	      Integer [] arr= {1,2,3,4,5};
	      Assert.assertFalse(new App().app(arr,arrayList,4,4));
	    }
	
}
*/

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert;
import java.util.ArrayList;
import java.util.Arrays;
import junit.framework.TestCase;


/*
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
//import org.junit.Assert;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
//import static org.junit.*;
//import static org.junit.jupiter.api.Assertions.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
*/
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
    
    public void arrayIsEmpty() {
	      ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	      ArrayList<Integer> arr = new ArrayList<>(Arrays.asList());
	      Assert.assertFalse(new App().search(arr,arrayList,4,4));
	    }
	public void arrayListIsEmpty() {
	      ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList());
	      ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	      Assert.assertFalse(new App().search(arr,arrayList,4,4));
	    }
	public void firstIntegerZeroOrlessThanZero() {
	      ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	      ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	      Assert.assertFalse(new App().search(null,arrayList,0,4));
	    }
	public void SecondIntegerZeroOrlessThanZero() {
	      ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	      ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	      Assert.assertFalse(new App().search(null,arrayList,4,0));
	    }
	public void differentSizeArrayAndArrayList() {
	      ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	      ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	      Assert.assertFalse(new App().search(arr,arrayList,4,4));
	    }
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}


