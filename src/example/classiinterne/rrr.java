package example.classiinterne;

import example.classiinterne.Esterna.Interna;
import example.classiinterne.Esterna.InternaStatica;

public class rrr {

 	public static void main(String[] args) {
 		
			Esterna a = new Esterna();
			Esterna.Interna jk3 = a. new Interna();
			Interna jk4 = a. new Interna();
			Interna jk5 = new Esterna(). new Interna();
			
			
			Esterna.InternaStatica j  = new InternaStatica();
			
			Interna l = new Esterna().new Interna();
			InternaStatica r = new Esterna.InternaStatica();
			
			r.metodoInterno();
			Esterna.InternaStatica.metodoInternoDue();
 	}

}
