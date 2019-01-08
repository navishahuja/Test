package Validate;

public class LeapYearValidate {

	/*
	 * The program will validate wether the value entered by the user is Leap year or Not
	 */

	public static boolean isLeapYear(int year) {
		 if (year % 4 != 0) {
		    return false;
		  } else if (year % 400 == 0) {
		    return true;
		  } else if (year % 100 == 0) {
		    return false;
		  } else {
		    return true;
		  }
		}
		/*if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
			return true;
		}else{
			return false;
		}*/
	}

