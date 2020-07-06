package datumiPaket;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Datumi {

	public static void main(String[] args) {
		
		
		Calendar calendar = new GregorianCalendar();
			calendar.set(Calendar.YEAR,2020);
			calendar.set(Calendar.MONTH, 7);
			calendar.set(Calendar.DAY_OF_MONTH, 6);
		
		System.out.println("Danas je mesec: " +  calendar.get(Calendar.MONTH));
		
	}

}
