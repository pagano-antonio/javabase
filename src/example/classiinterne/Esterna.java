package example.classiinterne;

//static class prova{
//	
//}

public class Esterna {
	private int x;
	
 	public class Interna {
 		private int y;
 		public void metodoInterno(){
 			Esterna.this.x = 40;
 			
 		}
	 }

 	
 	public static class InternaStatica {
 		private int y;
 		public void metodoInterno(){
 			//...
 		}
 		public static void metodoInternoDue(){
 			//...
 		}
	 }
 	
 	public static void main(String[] args) {
 		
 			Esterna a = new Esterna();
 			Esterna.Interna jk3 = a. new Interna();
 			Esterna.Interna jk4 = new Esterna(). new Interna();
 			
 			Esterna.InternaStatica j  = new InternaStatica();
 			
 			Interna l = new Esterna().new Interna();
 			InternaStatica r = new Esterna.InternaStatica();
 			
 			r.metodoInterno();
 			Esterna.InternaStatica.metodoInternoDue();
 		

 			
 		
 		
 		
// 		Esterna.InternaStatica j  = new InternaStatica();
// 		Esterna.Interna jk3 = new Esterna(). new Interna();
// 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		Esterna f = new Esterna();
 		Interna i22 =   new Esterna(). new Interna();
 		
 		InternaStatica jk=  new Esterna.InternaStatica();
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
// 		Esterna.Interna r = f.new Interna();
// 		
// 		Esterna.InternaStatica r2 = new Esterna.InternaStatica(); 
// 		 
// 		Esterna.InternaStatica.metodoInternoDue();
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
// 		Esterna d = new Esterna();
// 	
// 		Interna a =d. new Interna();
// 		
// 		Interna a1 = new Esterna().new Interna();
// 		
// 		InternaStatica a2 = new Esterna. InternaStatica();
// 		
// 		
// 		
// 		
 		
 		
 		
 		
 		
 		
 		
 		
 		//MyInner is a static nested class, so it must be instantiated using the fully-scoped name of MyOuter.MyInner.
 		
// 		//b
// 		Esterna.InternaStatica mi = new InternaStatica();
// 		//d
// 		InternaStatica mi2 = new Esterna.InternaStatica();
// 		//a
// 		Esterna.InternaStatica m = new Esterna.InternaStatica();
//
// 		
// 		Esterna.Interna f = new Esterna().new Interna();
// 		
// 		Esterna h = new Esterna();
// 		Esterna.Interna f2 = h.new Interna();
	}
 	
 	
 	
 	
 	
 	
 	
 	
// 	public static void main(String[] args) {
//		
// 		Esterna e = new Esterna();
// 		Esterna.Interna ei = e.new Interna();
// 		
// 		
// 		InternaStatica eiSt = new Esterna.InternaStatica ();
//
// 		
//	}
 	
}
