package datumiPaket;

import java.time.LocalDate;
import java.time.LocalTime;

public class Datumi {

	public static void main(String[] args) {
	
		
		LocalDate datum = LocalDate.now();
		LocalTime vreme = LocalTime.now();
		System.out.println(datum);
		
		System.out.println("Godina: " + datum.getYear());
		System.out.println("Mesec je: " + datum.getMonth());
		System.out.println("Mesec je: " + datum.getMonthValue());
		System.out.println("Dan je: " + datum.getDayOfMonth());
		System.out.println("Dan u nedelji je : " + datum.getDayOfWeek());
		System.out.println("Dan u nedelji je : " + datum.getDayOfYear());
		System.out.println("Era:" + datum.getEra());
		
		
		System.out.println("Sati je: " + vreme.getHour());
		System.out.println("Minuta je: " + vreme.getMinute());
		System.out.println("Sekundi je: " + vreme.getSecond());
		
		
		
	}

}
