package eg1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		
		/*
		 * dd - date
		 * MM - month in digits  MMM - short name of month   MMMM - Full Month Name
		 * yy - last 2 digits of year    yyyy - Full Year
		 * EEE - short name of day  EEEE - full day name
		 * hh - 12 hour
		 * HH - 24 hour
		 * mm - mins
		 * ss - seconds
		 * a - AM/PM
		 * z / Z - time zones
		 * SS - millisecs
		 */
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yy   hh:mm:ss a  z Z  EEEE SS");
		// String <- format(dateobj)
		System.out.println(sdf.format(d));

	}

}
