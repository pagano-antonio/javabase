package enumexample;

public class Test {

	public static void prova(Semi x) {
		if(x.equals(Semi.CUORI))
		{
			System.out.println("è cuori!!!!!!!!!!!1");
		}
		
	}
	public static void main(String[] args) {

			Semi s = Semi.CUORI;
			prova(s);
//			
			for(Semi f : Semi.values())
				System.out.println(f);
		
		
		
		
		Semi1 x = Semi1.CUORI;
		System.out.println(x.getNumeroCarte());
		
		
//		Semi2 y = Semi2.CUORI;
//		System.out.println(y.getNumeroCarte());
//		System.out.println(y.isRed());
		
			
			
	}

}
