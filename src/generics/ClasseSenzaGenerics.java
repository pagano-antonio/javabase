package generics;

public class ClasseSenzaGenerics {
	 private Object item;

	    public void setItem(Object item) {
	        this.item = item;
	    }

	    public Object getItem() {
	        return item;
	    }
	    
	    
	    public static void main(String[] args) {
			//esempio funzionante
	    	ClasseSenzaGenerics box = new ClasseSenzaGenerics();
	    	box.setItem("Ciao");
	    	String item =  (String) box.getItem(); // Devi fare un cast a String

	    	
//	    	//non funzionante
	    	ClasseSenzaGenerics box1 = new ClasseSenzaGenerics();
	    	box1.setItem(10); // Cast a String causerebbe un errore a runtime
	    	
	    	String item1 = (String) box1.getItem(); // ClassCastException

	    	
		}
}
