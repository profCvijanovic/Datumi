package datumiPaket;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datumi {

	public static void main(String[] args) {
		
		Date datum = new Date();
		System.out.println(datum);
		// 04.02.1987
		// 4.2.1987
		// 4/2/1987
		// 4-2-1987
		// 1987-02-04
		SimpleDateFormat sdfSat = new SimpleDateFormat("HH/mm|ss");
		SimpleDateFormat sdfKalendar = new SimpleDateFormat("dd.MM.yyyy");
		SimpleDateFormat sdfUkupno = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String sat = sdfSat.format(datum);
		String kalendar = sdfKalendar.format(datum);
		String ukupno = sdfUkupno.format(datum);
		
		System.out.println("Danas je: " + kalendar);
		System.out.println("I sati je: " + sat);
		System.out.println("Ukupno: " + ukupno);

	}

}
