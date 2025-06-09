package example.patternabstractfactory;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Commesso commesso = null;
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("scegli fra ginnatica e tennis");
		String scelta = scanner.nextLine();
		System.out.println(scelta);

		if (scelta.equals("tennis")){
			commesso = new CommessoTennis();
		}
		else{
			commesso = new CommessoGinnastica();
		}
		
		Scarpa scarpa =commesso.getScarpa();
		scarpa.create();
		Borsa borsa =commesso.getBorsa();
		borsa.create();
		
	}

}
