package esempio.matrici;

public class Test {

	public static void main(String[] args) {
	
		
		int[] arrayUnidimensionale = new int[5];
		
		int[][] m = new int[5][10];
		
		
		arrayUnidimensionale[0] = 20;
		
		m[0][0] = 3;
		m[1][2] = 2;
		
		for(int i = 0; i< 5; i++) {
			for(int j = 0; j< 10; j++) {
				System.out.print(m[i][j] + "-");
			}
			System.out.println("");
		}
		
		
	}

}
