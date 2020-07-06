package datumiPaket;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datumi {

	public static void main(String[] args) {
		
		String datumIzEksela = "04/05/1997 12:25:34";
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date datum = null;
		try {
			datum= sdf.parse(datumIzEksela);
			System.out.println(datum);
			
			SimpleDateFormat zaBazu = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(zaBazu.format(datum));
		} catch (ParseException e) {
			System.out.println("Ne valja ti format!");
		}
		
		
		
	}

}
