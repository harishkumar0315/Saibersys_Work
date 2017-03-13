package Training;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CurrentDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Method: 1
// Current Date and Time		
DateFormat df = new SimpleDateFormat("MM/DD/YY hh:mm:ss");
Date d = new Date();
String d1 = df.format(d);
System.out.println("Current date and time is" +d1);

//Method: 2
// Previous Date

/*// get a calendar instance, which defaults to "now"
Calendar calendar = Calendar.getInstance();

// get a date to represent "today" 
Date today = calendar.getTime();
System.out.println("today: " + today); 

// add one day to the date/calendar 
calendar.add(Calendar.DAY_OF_MONTH, 1); 

// now get "tomorrow" 
Date tomorrow = calendar.getTime(); 
 
// print out tomorrow's date 
System.out.println("tomorrow: " + tomorrow);*/

//Method: 3
/*Calendar c = Calendar.getInstance();
System.out.println(c.get(Calendar.DAY_OF_MONTH));
System.out.println(c.get(Calendar.DAY_OF_YEAR));*/

/*//Method: 4	
DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // declare as DateFormat
//Calendar today = Calendar.getInstance();
Calendar yesterday = Calendar.getInstance();
yesterday.add(Calendar.DATE, +2);
Date d = yesterday.getTime(); // get a Date object
String yesDate = sdf.format(d); // toString for Calendars is mostly not really useful
System.out.println(yesDate);*/	
	
	}

}
