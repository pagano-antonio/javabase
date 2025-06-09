package example.patternproxytre;

public class Client {

	 
	    public static void main(String[] args) {
	        ContoCorrente contoCorrente = new ProxyIntesaSanPaolo( "pippo",  "pluto");
	        System.out.println( "login errato: " + contoCorrente.listaMovimenti("0123456789") );
	 
	        contoCorrente = new ProxyIntesaSanPaolo( "pippo",  "pippo");
	        System.out.println( "login corretto: " + contoCorrente.listaMovimenti("0123456789") );
	    }
	}