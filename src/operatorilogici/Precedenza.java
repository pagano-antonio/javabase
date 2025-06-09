package operatorilogici;

public class Precedenza {
	
	
//	    Precedenza degli operatori logici in Java:
//		NOT (!) – ha la precedenza più alta.
//		AND (&&) – viene valutato dopo il NOT.
//		OR (||) – ha la precedenza più bassa.

//	Quando ci sono più operatori con la stessa precedenza 
//(ad esempio, due OR consecutivi), l'associazione è da sinistra verso
//destra.
	
	// parentesi hanno sempre la precedenza su tutto
	


//	Quando ci sono più parentesi annidate in un'espressione logica, 
//	Java valuta prima le espressioni racchiuse nelle parentesi più 
//	interne e procede verso l'esterno.

	public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        

        // Esempio senza parentesi
        boolean risultato1 = !a || b && c;
        // Ordine di valutazione:
        // 1. NOT (`!a`) -> !true -> false
        // 2. AND (`b && c`) -> false && true -> false
        // 3. OR (`false || false`) -> false

        System.out.println("Risultato senza parentesi: " + risultato1);

        
        
        // Esempio con parentesi
        boolean risultato2 = (a || b) && !c;
        // Ordine di valutazione:
        // 1. Parentesi (`a || b`) -> true || false -> true
        // 2. !c  -> !true -> false
        // 3. (true) && !true -> true && false  -> false

        System.out.println("Risultato con parentesi2: " + risultato2);

        // Esempio con un ordine ancora diverso
        boolean risultato3 = !a || (b && c);
        // Ordine di valutazione corretto:
        // 1. Parentesi (`b && c`) -> false && true -> false
        // 2. NOT (`!a`) -> !true -> false
        // 3. OR (`false || false`) -> false

        System.out.println("Risultato con un ordine diverso: " + risultato3);
    
	
        // Esempio complesso con più parentesi
        boolean d = false;
        boolean risultato4 = (!a || (b && c)) && (a || d);
//        (!a || false) && (a || d)
//        false && (a || d)
//        false && true
//        false
        // Ordine di valutazione:
        // 1. Valutazione delle parentesi interne:
        //    - (b && c) -> false && true -> false
        //    - (a || d) -> true || false -> true
        // 2. Valutazione del NOT:
        //    - !a -> !true -> false
        // 3. Valutazione della prima OR:
        //    - (!a || (b && c)) -> false || false -> false
        // 4. Valutazione della AND finale:
        //    - (false && (a || d)) -> false && true -> false

        System.out.println("Risultato con più parentesi: " + risultato4);

	
	}

}
