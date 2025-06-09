package example.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ProvaRefl {
	
	
	
	public Object fromModelToDTO(Object dto) {
		Object o = new Object()
				
		dto.----> ruoloID--> 5
		
		o.ruoloid= 5;
		
	}
	
	
	
	
	public static void main(String[] args) {

		// Ottengo la referenza all'oggetto Class di interesse
		Class c;
		try {
			c = Class.forName("example.reflection.Persona");

			// Recupero la lista dei Campi della Classe
			Field campi[] = c.getDeclaredFields();

			// Visualizzo i dati di Ciascun Campo
			for (int i = 0; i < campi.length; i++) {
				Field campoCorrente = campi[i];
				System.out.println("Campo n." + (i + 1) + ":");
				System.out.println("Nome: " + campoCorrente.getName());
				System.out.println("Tipo: " + campoCorrente.getType());
				String modificatore = Modifier.toString(campoCorrente.getModifiers());
				System.out.println("Modificatore: " + modificatore);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
