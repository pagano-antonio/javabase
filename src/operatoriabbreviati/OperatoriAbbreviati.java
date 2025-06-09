package operatoriabbreviati;

public class OperatoriAbbreviati {

	public static void main(String[] args) {
		int a = 2;
		a = a + 5;

		int ab = 2;
		ab += 5;

		int ac = 2;
		ac -= 5;
		ac /= 5;
		ac *= 5;

		int x = 2;
		int y = 20;

		x = 10;
		y = x++;// risultato: X=11 e Y=10
		// corrisponde a
		// y = x
		// x = x+1

		x = 10;
		y = x--; // risultato: X=9 e Y=10
		// corrisponde a
		// y = x
		// x = x-1

		x = 10;
		y = ++x; // risultato: X=11 e Y=11
		// corrisponde a
		// x = x+1
		// y = x

		x = 10;
		y = --x; // risultato: X=9 e Y=9
		// corrisponde a
		// x = x-1
		// y = x

	}
}
