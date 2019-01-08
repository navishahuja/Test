package ValidateTest;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

import Validate.LeapYearValidate;


/*
 * Test is used for 
 * 1.Valid entry by the user
 * 2. Its Leap year or not.
 * 
 */
public class ValidateTestLY {
	   
	 
	    @Test
	    public void isLeapYearKeboardTest() throws IOException {
	    	LeapYearValidate leapYear = new LeapYearValidate();
	    	int year;
	    	boolean isNumber;
	 
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter year(yyyy):");
	        
	        do{
	        	if(sc.hasNextInt()){
	        		year=sc.nextInt();
	        		isNumber=true;
	        		if(leapYear.isLeapYear(year)){
	    	        	System.out.println(year+" Is a Leap Year.");
	    	        }else{
	    	        	System.out.println(year+" Is Not a Leap Year.");
	    	        }
	    	        assertTrue("Leap Year", leapYear.isLeapYear(year));
	    	        sc.close();
	        	}else{
	        		System.out.println("Enter Valid Year");
	        		isNumber=false;
	        		sc.next();
	        	}
	        }   while(isNumber);
	        	
	    }
}

	

