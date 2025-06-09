package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.xml.internal.ws.api.server.SDDocumentFilter;

public class Prova {

	
	public static void main(String[] args) {
		
		Date oggi = new Date();
		System.out.println(oggi);
		
	
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		
////
		System.out.println(sdf.format(oggi));
////		
////		
		try {
			Date past = sdf.parse("25/12/2005");
			System.out.println(past);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


