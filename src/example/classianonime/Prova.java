package example.classianonime;

public class Prova {

	public static void main(String[] args) {
		
		A tfc = new AEstesa();
		
		
		//estendere A override di f()
		A tmp = new A() {
			
		    public void f() {
		     System.out.println("override");
		    }

			@Override
			public void g() {
				// TODO Auto-generated method stub
				
			}

		    
		  };
		  
		  tmp.f();
		  
		  
			Runnable r = new Runnable() {

				@Override
				public void run() {
					System.out.println("ddddd");

				}

			};
			
			
			B tmp2 = new B() {
				
			};
			
			B tmp3 = new B() {
				public void hello() {
					System.out.println("hh");
					
				}
				public void ciao() {
					System.out.println("gggg");
					
				}
			};
			

	}

}
