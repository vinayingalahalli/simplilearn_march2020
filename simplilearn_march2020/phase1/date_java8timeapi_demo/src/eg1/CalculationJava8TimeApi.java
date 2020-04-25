package eg1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CalculationJava8TimeApi {

	public static void main(String[] args) {
		
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		ld=ld.plusDays(12);
		System.out.println(ld);
		ld=ld.plusYears(10);
		System.out.println(ld);
		System.out.println(ld.isLeapYear());
		ld=ld.minusYears(10);
		System.out.println(ld);
		System.out.println(ld.isLeapYear());
		
		LocalDate ld1=LocalDate.parse("12-10-1980", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(ld1);
		LocalDate curr=LocalDate.now();
		
		Period p=Period.between(ld1, curr);
		System.out.println("You are "+p.getYears()+"years, "+p.getMonths()+"months "+p.getDays()+"days old");
		
		//LocalTime, LocalDateTime, Zone 
		System.out.println(ChronoUnit.DAYS.between(ld1, curr));
		System.out.println(ChronoUnit.MONTHS.between(ld1, curr));
		System.out.println(ChronoUnit.YEARS.between(ld1, curr));
	}
	

}
