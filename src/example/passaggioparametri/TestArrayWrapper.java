package example.passaggioparametri;

public class TestArrayWrapper {
	public void helloTre(Integer x) {
		x = 30;

		x = new Integer(3);
	}
	//mostra che un array di interi  è passato per riferimento
	void start() {
		long[] a1 = { 3, 4, 5 };
		long[] a2 = fix(a1);
		System.out.println(" " + a1[0] + a1[1] + a1[2]);
		System.out.println(" " + a2[0] + a2[1] + a2[2]);
		
		a2[0]= 30;
		System.out.println("a1 dopo  " + a1[0] + a1[1] + a1[2]);
		System.out.println("a2 dopo " + a2[0] + a2[1] + a2[2]);
	
	}

	long[] fix(long[] a3) {

		a3[1] = 7;
		return a3;
	}
	public void helloDue(Integer h) {
		h = 40;
		
		h = new Integer(40);
	}
	
	public void hello(int[] tmp)
	{
		tmp[0] = 10;
		
	}
	
    public static void main(String[] args) {

    	TestArrayWrapper p = new TestArrayWrapper();
    	
    
//    	int[] res = new int[5];
//    	res[0]= 5;
//    	
//    	p.hello(res);
//    	
//    	System.out.println(res[0]);
    
    	
    	Integer t = 20;
    	p.helloTre(t);
    	System.out.println(t);
    	
    	
   	
    	
    }
}
  

