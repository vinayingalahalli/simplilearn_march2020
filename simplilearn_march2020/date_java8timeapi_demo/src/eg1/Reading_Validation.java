package eg1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reading_Validation {

	public static void main(String[] args) {
	//dd-MM-yyyy
		String s="21-13-1992";
		if(s.matches("[0-9]{2}-[0-9]{2}-[0-9]{4}")) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		//Date<-parse(stringobj)->ParseException
		sdf.setLenient(false);
		try {
			Date d=sdf.parse(s);
			System.out.println(d);
		} catch (ParseException e) {
			System.out.println(e);
		}
		}else {
			System.out.println("invalid date");
		}

	}

}
