package MasterUdemy;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int m = scan.nextInt();
    int y = scan.nextInt();
    NumberOfdays(m, y);
    
    currentMonthdays();
    dateTimeNow();
}
//=============================================================
	public static void NumberOfdays(int m, int y) {
	    int d = 0;
		if(m == 4 || m == 6 || m == 9 || m==11){
		       d = 30;
		   }else if(m == 2){
			   if(m == 2 && ((y %4 == 0 && y %100 !=0) || (y % 100 == 0 && y % 400 == 0))){
			       d = 29;
			   }else {
		       d = 28;
			   }
		   }else{
		       d = 31;
		   }		  
		String[] months = {"January", "February","March", "April","May","June", "July", "August", "September", "October", "November", "December"};
		System.out.println("In "+y+","+months[m-1]+" has "+d+" days");
	}
//-----------------------------------------------------------------
	public static void currentMonthdays() {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
		int daysOfMonth = 31;
		switch(month) {
		    case 4:
		    case 6:
		    case 9:
		    case 11:
		    	daysOfMonth = 30;
		    	break;
		    case 2:
		    	daysOfMonth = 28;
		    	if((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) {
    				daysOfMonth = 29;
				};
				break;
		}
		System.out.println("This month has " + daysOfMonth + " days.");
	}
//------------------------------------------------------------------
	public static void dateTimeNow() {
		// dd-MMM-yyyy
		// E, MMM dd yyyy
		// EEEE, MMM dd, yyyy HH:mm:ss a
		System.out.println();
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	     LocalDateTime now = LocalDateTime.now();  
	     System.out.println("current time is  " + dtf.format(now));
	     //current time is  2020/07/07 09:04:00
	     DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("hh:mm a");
	     LocalTime localTime = LocalTime.now();
	     String localTimeString = FOMATTER.format(localTime);	     
	     System.out.println("Time now: " + localTimeString);
	     //Time now: 09:04 AM
	     System.out.println("\nToday is: " + new java.util.Date());
	     //Today is: Tue Jul 07 09:04:00 EDT 2020
	     int year = Calendar.getInstance().get(Calendar.YEAR);
		 int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
		 System.out.println("Today is month : " + month +" "+ year);
		 //Today is month : 7 2020
	}
	
}