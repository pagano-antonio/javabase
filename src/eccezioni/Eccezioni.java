package eccezioni;

public class Eccezioni {

	public static int ret(int v) {
		int t = 0;
		try {
			System.out.println("dentro il try");
			t = v / 0;
		} catch (Exception  e) {
			System.err.println("siamo dentro il catch");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.err.println("ssss");
			e.printStackTrace();
		} finally {

			System.out.println("codice dentro finally");
		}
		return t;
	}

	public static void main(String[] args) {

		int y = 30;
		ret(y);

	}
}
