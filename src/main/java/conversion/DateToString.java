package conversion;

//TO get a Local Date and Time
import java.time.LocalDateTime;
//To set a Format
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.Locale;  


public class DateToString {
	public static void main(String args[])  {
		LocalDateTime lt = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyy hh:mm:ss"); // Set format
		System.out.println(lt);

		String formattedDate = lt.format(dtf);
		String sDate1="31/12/1998"; 
		Date d = new SimpleDateFormat(" yyyy-MMM-dd").parse(sDate1);
		System.out.println("After formatting: " + formattedDate);
		System.out.println(" ");
		System.out.println(" " +d);
	}
}
